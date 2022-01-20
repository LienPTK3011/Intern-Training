package com.booking.project.Infrastructure;

import com.booking.project.Domain.Seat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository(value = "SeatDao")
@Transactional(rollbackFor = Exception.class)
public class SeatDao implements Dao<Seat>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Seat get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Seat.class, id);
    }

    @Override
    public List<Seat> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM Seat", Seat.class).getResultList();
    }

    @Override
    public void save(Seat seat) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(seat);
    }

    @Override
    public void update(Seat seat) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(seat);
    }

    @Override
    public void delete(Seat seat) {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(seat);
    }
}
