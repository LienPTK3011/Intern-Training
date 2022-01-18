package nvnam.tlu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvnam.tlu.model.Room;
import nvnam.tlu.model.RoomBooking;

public interface RoomBookingRepository extends JpaRepository<RoomBooking, Long>{
	List<RoomBooking> findByRoomCodeContaining(String q);
}
