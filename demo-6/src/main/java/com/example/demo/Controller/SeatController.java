package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Domain.Seat;
import com.example.demo.Service.SeatService;

@Controller
//@RequestMapping("/Seat")
public class SeatController {
	@Autowired
	private SeatService seatService;

	@GetMapping("/seat")
	public String Seat(Model model) {
		List<Seat> listseat = seatService.listAllSeat();
		model.addAttribute("listseat", listseat);
		return "seat";
	}

	@GetMapping("/seat/addseat")
	public String addSeat(Model model) {
		List<Seat> listseat = seatService.listAllSeat();
		model.addAttribute("listseat", listseat);
		model.addAttribute("seat", new Seat());
		return "addseat";
	}

	@RequestMapping(value = "/seat/addseat/save", method = RequestMethod.POST)
	public String saveSeat(@ModelAttribute("seat") Seat seat) {
		seatService.saveSeat(seat);
		return "redirect:/seat";
	}

	@RequestMapping("seat/edit/{id}")
	public ModelAndView showEditSeatPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("addseat");
		Seat seat = seatService.get(id);
		mav.addObject("seat", seat);
		return mav;

	}

	@RequestMapping("seat/delete/{id}")
	public String deleteSeatPage(@PathVariable(name = "id") int id) {
		seatService.deleteSeat(id);
		return "redirect:/seat";
	}
}
