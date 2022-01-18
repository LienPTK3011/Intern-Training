package nvnam.tlu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvnam.tlu.model.Room;
import nvnam.tlu.repository.*;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
    private RoomRepository RoomRepository;
    @Override
    public Iterable<Room> findAll() {
        return RoomRepository.findAll();
    }
    @Override
    public List<Room> search(String q) {
        return RoomRepository.findByRoomCodeContaining(q);
    }
    
    @Override
    public Room findOne(long id) {
        return RoomRepository.getOne(id);
    }
    @Override
    public void save(Room room) {
    	RoomRepository.save(room);
    }
    @Override
    public void delete(Room room) {
    	RoomRepository.delete(room);
    }
}