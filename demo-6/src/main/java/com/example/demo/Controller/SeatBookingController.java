/*package com.example.demo.Controller;

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
import com.example.demo.Domain.SeatBooking;
import com.example.demo.Service.SeatBookingService;
import com.example.demo.Service.SeatService;

@Controller
@RequestMapping("/SeatBooking")
 
public class SeatBookingController {
@Autowired
    private SeatBookingService seatBookingService;
@Autowired
private SeatService seatService;
 
    @GetMapping("/addseatbooking")
    public String SeatBooking(Model model) {
     List<SeatBooking> listseatbooking = seatBookingService.listAllSeatBooking();
     List<Seat> listseat = seatService.listAllSeat();
    model.addAttribute("listseat", listseat);
        model.addAttribute("listseatbooking", listseatbooking);
        model.addAttribute("seatbooking", new SeatBooking());
        return "addseatbooking";
    }
    
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSeatBooking(@ModelAttribute("student") SeatBooking seatbooking)
    {
        seatBookingService.save(seatbooking);
        return "redirect:/seatbooking";
    }
    
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditSeatBookingPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("addsseatbooking");
        List<Seat> listseat = seatService.listAllSeat();
        SeatBooking seatbooking = seatBookingService.get(id);
        mav.addObject("seatbooking", seatbooking);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deleteStudentPage(@PathVariable(name = "id") int id) {
        seatBookingService.delete(id);
        return "seatbooking";
    }
 
}*/
