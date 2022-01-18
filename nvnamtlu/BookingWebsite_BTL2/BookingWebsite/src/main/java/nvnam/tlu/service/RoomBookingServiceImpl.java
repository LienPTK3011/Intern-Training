package nvnam.tlu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvnam.tlu.model.RoomBooking;
import nvnam.tlu.repository.RoomBookingRepository;

@Service
public class RoomBookingServiceImpl implements RoomBookingService {
	@Autowired
    private RoomBookingRepository roomBookingRepository;
    @Override
    public Iterable<RoomBooking> findAll() {
        return roomBookingRepository.findAll();
    }
	@Override
	public void save(RoomBooking roomBooking) {
		roomBookingRepository.save(roomBooking);
	}
}
