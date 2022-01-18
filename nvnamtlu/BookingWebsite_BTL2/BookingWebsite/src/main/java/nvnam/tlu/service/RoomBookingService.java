package nvnam.tlu.service;

import nvnam.tlu.model.RoomBooking;

public interface RoomBookingService {
	Iterable<RoomBooking> findAll();
    void save(RoomBooking roomBooking);
}
