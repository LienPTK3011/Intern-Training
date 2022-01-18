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
import nvnam.tlu.service.RoomBookingService;
import nvnam.tlu.service.RoomService;
@Controller
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private RoomBookingService roomBookingService;
	
	@GetMapping("/admin/room")
	public String index(Model model) {
		model.addAttribute("rooms", roomService.findAll());
		return "listRoom";
	}
	@GetMapping("/admin/room/create")
	public String create(Model model) {
		model.addAttribute("room", new Room());
		return "addRoom";
	}
	@GetMapping("/admin/room/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("room", roomService.findOne(id));
		return "editRoom";
	}
	@RequestMapping("/admin/room/update")
	public String update(@Validated Room room, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "editRoom";
		}
		roomService.save(room);
		redirect.addFlashAttribute("success", "Update room successfully!");
		return "redirect:/admin/room";
	}
	
	@RequestMapping("/admin/room/save")
	public String save(@Validated Room room, BindingResult result, RedirectAttributes redirect, Model model) {
		if (result.hasErrors()) {
			return "addRoom";
		}
		ArrayList<Room> listRoom = (ArrayList<Room>) roomService.findAll();
		for(int i=0; i<listRoom.size(); i++) {
			if(room.getRoomCode().equals(listRoom.get(i).getRoomCode())) {
				model.addAttribute("exist", "Add new room failed, this room code is already exist!");
				return "addRoom";
			}
		}
		roomService.save(room);
		redirect.addFlashAttribute("success", "Saved room successfully!");
		return "redirect:/admin/room";
	}
	@GetMapping("/admin/room/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect, Model model) {
		ArrayList<RoomBooking> listRoomBooking = (ArrayList<RoomBooking>) roomBookingService.findAll();
		Room room = roomService.findOne(id);
		for(int i=0; i<listRoomBooking.size(); i++) {
			if(room.getRoomCode().equals(listRoomBooking.get(i).getRoomCode())) {
				model.addAttribute("booked", "Can't delete this room, because this room was booked by someone!");
				model.addAttribute("rooms", roomService.findAll());
				return "listRoom";
			}
		}
        roomService.delete(room);
		redirect.addFlashAttribute("success", "Deleted room successfully!");
		return "redirect:/admin/room";
	}
	@GetMapping("/admin/room/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/admin/room";
		}
		model.addAttribute("rooms", roomService.search(s));
		return "listRoom";
	}
}