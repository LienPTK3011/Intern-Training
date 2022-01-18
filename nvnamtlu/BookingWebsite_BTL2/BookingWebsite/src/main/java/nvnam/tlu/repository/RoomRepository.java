package nvnam.tlu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvnam.tlu.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByRoomCodeContaining(String q);
}