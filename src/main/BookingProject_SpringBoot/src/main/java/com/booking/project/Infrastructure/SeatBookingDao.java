package com.booking.project.Infrastructure;

import com.booking.project.Domain.SeatBooking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository(value = "SeatBookingDao")
@Transactional(rollbackFor = Exception.class)
public class SeatBookingDao implements Dao<SeatBooking> {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public SeatBooking get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(SeatBooking.class, id);
    }

    @Override
    public List<SeatBooking> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM SeatBooking", SeatBooking.class).getResultList();
    }

    @Override
    public void save(SeatBooking seatBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(seatBooking);
    }

    @Override
    public void update(SeatBooking seatBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(seatBooking);
    }

    @Override
    public void delete(SeatBooking seatBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(seatBooking);
    }
}
