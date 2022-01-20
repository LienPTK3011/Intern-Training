package com.booking.project.Controller;

import com.booking.project.Domain.SeatBooking;
import com.booking.project.Dto.BookingRoomDto;
import com.booking.project.Dto.BookingSeatDto;
import com.booking.project.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/room")
    public String bookingRoom(@RequestBody BookingRoomDto bookingRoomDto){
        return bookingService.bookingRoom(bookingRoomDto);
    }

    @GetMapping("/room/show")
    public List<BookingRoomDto> showBookingRoom(){
        return bookingService.showBookingRoom();
    }

    @PostMapping("/seat")
    public String bookingSeat(@RequestBody BookingSeatDto bookingSeatDto){
        return bookingService.bookingSeat(bookingSeatDto);
    }

    @GetMapping("/seat/show")
    public List<BookingSeatDto> showSeatRoom(){
        return bookingService.showSeatRoom();
    }
}
