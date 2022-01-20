package com.booking.project.Controller;

import com.booking.project.Domain.User;
import com.booking.project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/show")
    public List<User> showUser(){
        return userService.findAll();
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User room){
        userService.save(room);
    }
}
