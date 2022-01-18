package nvnam.tlu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import nvnam.tlu.model.Room;
import nvnam.tlu.model.RoomBooking;
import nvnam.tlu.service.RoomBookingService;
import nvnam.tlu.service.RoomService;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Controller
public class RoomBookingController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private RoomBookingService roomBookingService;

	@GetMapping("/user/roomBooking")
	public String create(Model model) {
		model.addAttribute("room_booking", new RoomBooking());
		model.addAttribute("roomCodes", roomService.findAll());
		return "roomBooking";
	}
	
	@RequestMapping("/user/roomBooking/bookingDone")
	public String save(@Validated RoomBooking roomBooking, Principal principal, BindingResult result, Model model) {
		double payment = roomBooking.calculatePrice();
		roomBooking.setTotalPayment(payment);
		ArrayList<RoomBooking> listRoomBooking = (ArrayList<RoomBooking>) roomBookingService.findAll();
		if(roomBooking.getStartTime().isAfter(roomBooking.getEndTime())) {
			model.addAttribute("bookingFailed", "Booking room failed, This time is not valid");
			create(model);
			return "roomBooking";
		}
		for (int j = 0; j < listRoomBooking.size(); j++) {
			if ((roomBooking.getRoomCode().equals(listRoomBooking.get(j).getRoomCode())) && (roomBooking.getDayBK().equals(listRoomBooking.get(j).getDayBK()))
					&& MainController.timeAfter(roomBooking.getStartTime(), listRoomBooking.get(j).getStartTime()).isBefore(
							MainController.timeBefore(roomBooking.getEndTime(), listRoomBooking.get(j).getEndTime()))) {
				model.addAttribute("bookingFailed", "Booking room failed, this time have been booked by someone!");
				create(model);
				return "roomBooking";
			}
		}
		roomBooking.setUserName(principal.getName());
		roomBookingService.save(roomBooking);
		model.addAttribute("username", roomBooking.getUserName());
		model.addAttribute("code", roomBooking.getRoomCode());
		model.addAttribute("price", roomBooking.getPricePerHour());
		model.addAttribute("day", roomBooking.getDayBK());
		model.addAttribute("ST", roomBooking.getStartTime());
		model.addAttribute("ET", roomBooking.getEndTime());
		model.addAttribute("payment", payment);
		
		return "bookingSuccess";
	}
}