package nvnam.tlu.service;

import java.util.List;

import nvnam.tlu.model.Seat;

public interface SeatService {
	Iterable<Seat> findAll();
    List<Seat> search(String q);
    Seat findOne(long id);
    void save(Seat seat);
    void delete(Seat seat);
}