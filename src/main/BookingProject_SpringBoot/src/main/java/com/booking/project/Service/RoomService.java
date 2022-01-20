package com.booking.project.Service;

import com.booking.project.Domain.ConferenceRoom;
import com.booking.project.Infrastructure.ConferenceRoomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoomService {
    @Autowired
    private ConferenceRoomDao roomDao;
    public List<ConferenceRoom> findAll() {
        return roomDao.getAll();
    }
    public ConferenceRoom findById(final int id) {
        return roomDao.get(id);
    }
    public void save(final ConferenceRoom room) {
        roomDao.save(room);
    }
    public void update(final ConferenceRoom room) {
        roomDao.update(room);
    }
    public void delete(final int id) {
        ConferenceRoom room = roomDao.get(id);
        if (room != null) {
            roomDao.delete(room);
        }
    }
}
