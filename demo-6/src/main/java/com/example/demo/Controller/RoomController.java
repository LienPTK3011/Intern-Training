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
import com.example.demo.Domain.Room;
import com.example.demo.Service.RoomService;

@Controller
public class RoomController {
	@Autowired
	private RoomService roomService;

	@GetMapping("/room")
	public String viewRoomPage(Model model) {
		List<Room> listroom = roomService.listAllRoom();
		model.addAttribute("listroom", listroom);
		return "room";
	}

	@GetMapping("/room/addroom")
	public String addRoom(Model model) {
		List<Room> listroom = roomService.listAllRoom();
		model.addAttribute("listroom", listroom);
		model.addAttribute("room", new Room());
		return "addroom";
	}

	@RequestMapping(value = "/room/addroom/save", method = RequestMethod.POST)
	public String saveRoom(@ModelAttribute("room") Room room) {
		roomService.saveRoom(room);
		return "redirect:/room";
	}

	@RequestMapping("room/edit/{id}")
	public ModelAndView showEditRoomPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("addroom");
		Room room = roomService.get(id);
		mav.addObject("room", room);
		return mav;

	}

	@RequestMapping("room/delete/{id}")
	public String deleteRoomPage(@PathVariable(name = "id") int id) {
		roomService.deleteRoom(id);
		return "redirect:/room";
	}
}
