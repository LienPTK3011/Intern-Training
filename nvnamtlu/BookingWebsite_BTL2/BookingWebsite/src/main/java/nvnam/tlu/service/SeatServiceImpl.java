package nvnam.tlu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvnam.tlu.model.Seat;
import nvnam.tlu.repository.*;


@Service
public class SeatServiceImpl implements SeatService {
	@Autowired
    private SeatRepository seatRepository;
    @Override
    public Iterable<Seat> findAll() {
        return seatRepository.findAll();
    }
    @Override
    public List<Seat> search(String q) {
        return seatRepository.findBySeatCodeContaining(q);
    }
    
    @Override
    public Seat findOne(long id) {
        return seatRepository.getOne(id);
    }
    @Override
    public void save(Seat seat) {
    	seatRepository.save(seat);
    }
    @Override
    public void delete(Seat seat) {
    	seatRepository.delete(seat);
    }
}