package nvnam.tlu.service;

import java.util.List;

import nvnam.tlu.model.Room;


public interface RoomService {
	Iterable<Room> findAll();
    List<Room> search(String q);
    Room findOne(long id);
    void save(Room room);
    void delete(Room room);
}