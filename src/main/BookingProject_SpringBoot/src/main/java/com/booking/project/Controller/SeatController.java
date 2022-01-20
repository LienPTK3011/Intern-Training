package com.booking.project.Controller;

import com.booking.project.Domain.Seat;
import com.booking.project.Dto.BookingRoomDto;
import com.booking.project.Service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping("/show")
    public List<Seat> showRoom(){
        return seatService.findAll();
    }

    @PostMapping("/save")
    public void saveRoom(@RequestBody Seat seat){
        seatService.save(seat);
    }
}
