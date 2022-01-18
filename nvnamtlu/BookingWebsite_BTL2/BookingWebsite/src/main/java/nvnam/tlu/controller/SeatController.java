package nvnam.tlu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import nvnam.tlu.model.Room;
import nvnam.tlu.model.RoomBooking;
import nvnam.tlu.model.Seat;
import nvnam.tlu.model.SeatBooking;
import nvnam.tlu.service.SeatBookingService;
import nvnam.tlu.service.SeatService;

@Controller
public class SeatController {
	@Autowired
	private SeatService seatService;
	
	@Autowired
	private SeatBookingService seatBookingService;
	
	@GetMapping("/admin/seat")
	public String index(Model model) {
		model.addAttribute("seats", seatService.findAll());
		return "listSeat";
	}
    
	@GetMapping("/admin/seat/create")
	public String create(Model model) {
		model.addAttribute("seat", new Seat());
		return "addSeat";
	}
	
	@GetMapping("/admin/seat/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("seat", seatService.findOne(id));
		return "editSeat";
	}
	
	@RequestMapping("/admin/seat/update")
	public String update(@Validated Seat seat, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "addSeat";
		}
		seatService.save(seat);
		redirect.addFlashAttribute("success", "Update seat successfully!");
		return "redirect:/admin/seat";
	}
	
	@RequestMapping("/admin/seat/save")
	public String save(@Validated Seat seat, BindingResult result, RedirectAttributes redirect, Model model) {
		if (result.hasErrors()) {
			return "addSeat";
		}
		ArrayList<Seat> listSeat = (ArrayList<Seat>) seatService.findAll();
		for(int i=0; i<listSeat.size(); i++) {
			if(seat.getSeatCode().equals(listSeat.get(i).getSeatCode())) {
				model.addAttribute("exist", "Add new seat failed, this seat code is already exist!");
				return "addSeat";
			}
		}
		seatService.save(seat);
		redirect.addFlashAttribute("success", "Saved seat successfully!");
		return "redirect:/admin/seat";
	}
	@GetMapping("/admin/seat/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect, Model model) {
		ArrayList<SeatBooking> listSeatBooking = (ArrayList<SeatBooking>) seatBookingService.findAll();
		Seat seat = seatService.findOne(id);
		for(int i=0; i<listSeatBooking.size(); i++) {
			if(seat.getSeatCode().equals(listSeatBooking.get(i).getSeatCode())) {
				model.addAttribute("booked", "Can't delete this seat, because this seat was booked by someone!");
				model.addAttribute("seats", seatService.findAll());
				return "listSeat";
			}
		}
        seatService.delete(seat);
		redirect.addFlashAttribute("success", "Deleted seat successfully!");
		return "redirect:/admin/seat";
	}
	@GetMapping("/admin/seat/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/admin/seat";
		}
		model.addAttribute("seats", seatService.search(s));
		return "listSeat";
	}
}