package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Seat;
import com.example.demo.Repositiry.SeatRepository;

@Service
public class SeatService{
@Autowired
private SeatRepository seatrepo;

public List<Seat> listAllSeat() {
        return seatrepo.findAll();
    }
    
    public void saveSeat(Seat seat) {
        seatrepo.save(seat);
    }
    
    public Seat get(long id) {
        return seatrepo.findById(id).get();
    }
    
    public void deleteSeat(long id) {
        seatrepo.deleteById(id);
    }
 
}
