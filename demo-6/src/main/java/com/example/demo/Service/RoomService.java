package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Room;
import com.example.demo.Repositiry.RoomRepository;

@Service
public class RoomService{
@Autowired
private RoomRepository roomrepo;

public List<Room> listAllRoom() {
        return roomrepo.findAll();
    }
    
    public void saveRoom(Room room) {
        roomrepo.save(room);
    }
    
    public Room get(long id) {
        return roomrepo.findById(id).get();
    }
    
    public void deleteRoom(long id) {
        roomrepo.deleteById(id);
    }
 
}
