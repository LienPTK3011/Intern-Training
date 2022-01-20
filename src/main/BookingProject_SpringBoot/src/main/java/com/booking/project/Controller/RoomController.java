package com.booking.project.Controller;

import com.booking.project.Domain.ConferenceRoom;
import com.booking.project.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/show")
    public List<ConferenceRoom> showRoom(){
        return roomService.findAll();
    }

    @PostMapping("/save")
    public void saveRoom(@RequestBody ConferenceRoom room){
        roomService.save(room);
    }
}
