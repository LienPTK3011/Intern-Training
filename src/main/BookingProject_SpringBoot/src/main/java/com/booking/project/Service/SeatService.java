package com.booking.project.Service;

import com.booking.project.Domain.Seat;
import com.booking.project.Infrastructure.SeatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeatService {
    @Autowired
    private SeatDao seatDao;

    public List<Seat> findAll() {
        return seatDao.getAll();
    }
    public Seat findById(final int id) {
        return seatDao.get(id);
    }
    public void save(final Seat Seat) {
        seatDao.save(Seat);
    }
    public void update(final Seat Seat) {
        seatDao.update(Seat);
    }
    public void delete(final int id) {
        Seat Seat = seatDao.get(id);
        if (Seat != null) {
            seatDao.delete(Seat);
        }
    }
}
