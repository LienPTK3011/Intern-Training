package com.booking.project.Infrastructure;

import com.booking.project.Domain.ConferenceBooking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository(value = "ConferenceBookingDao")
@Transactional(rollbackFor = Exception.class)
public class ConferenceBookingDao implements Dao<ConferenceBooking>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public ConferenceBooking get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(ConferenceBooking.class, id);
    }

    @Override
    public List<ConferenceBooking> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM ConferenceBooking", ConferenceBooking.class).getResultList();
    }

    @Override
    public void save(ConferenceBooking conferenceBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(conferenceBooking);
    }

    @Override
    public void update(ConferenceBooking conferenceBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(conferenceBooking);
    }

    @Override
    public void delete(ConferenceBooking conferenceBooking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(conferenceBooking);
    }
}
