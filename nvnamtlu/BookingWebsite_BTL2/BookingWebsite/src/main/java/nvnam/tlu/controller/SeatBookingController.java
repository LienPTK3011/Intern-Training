package nvnam.tlu.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nvnam.tlu.model.SeatBooking;
import nvnam.tlu.service.SeatBookingService;
import nvnam.tlu.service.SeatService;

@Controller
public class SeatBookingController {
	@Autowired
	private SeatService seatService;
	
	@Autowired
	private SeatBookingService seatBookingService;

	@GetMapping("/user/seatBooking")
	public String create(Model model) {
		model.addAttribute("seat_booking", new SeatBooking());
		model.addAttribute("seatCodes", seatService.findAll());
		return "seatBooking";
	}

	@RequestMapping("/user/seatBooking/bookingDone")
	public String save(@Validated SeatBooking seatBooking, Principal principal, BindingResult result, Model model) {
		double payment = seatBooking.calculatePrice();
		seatBooking.setTotalPayment(payment);
		ArrayList<SeatBooking> listSeatBooking = (ArrayList<SeatBooking>) seatBookingService.findAll();
		if(seatBooking.getStartTime().isAfter(seatBooking.getEndTime())) {
			model.addAttribute("bookingFailed", "Booking seat failed, This time is not valid");
			create(model);
			return "seatBooking";
		}
		for (int j = 0; j < listSeatBooking.size(); j++) {
			if ((seatBooking.getSeatCode().equals(listSeatBooking.get(j).getSeatCode())) && (seatBooking.getDayBK().equals(listSeatBooking.get(j).getDayBK()))
					&& MainController.timeAfter(seatBooking.getStartTime(), listSeatBooking.get(j).getStartTime()).isBefore(
							MainController.timeBefore(seatBooking.getEndTime(), listSeatBooking.get(j).getEndTime()))) {
				model.addAttribute("bookingFailed", "Booking seat failed, this time have been booked by someone!");
				create(model);
				return "seatBooking";
			}
		}
		seatBooking.setUserName(principal.getName());
		seatBookingService.save(seatBooking);
		model.addAttribute("username", seatBooking.getUserName());
		model.addAttribute("code", seatBooking.getSeatCode());
		model.addAttribute("price", seatBooking.getPricePerHour());
		model.addAttribute("day", seatBooking.getDayBK());
		model.addAttribute("ST", seatBooking.getStartTime());
		model.addAttribute("ET", seatBooking.getEndTime());
		model.addAttribute("payment", payment);
		
		return "bookingSuccess";
	}
}