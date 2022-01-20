package com.booking.project.Infrastructure;

import com.booking.project.Domain.ConferenceRoom;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository(value = "ConferenceRoomDao")
@Transactional(rollbackFor = Exception.class)
public class ConferenceRoomDao implements Dao<ConferenceRoom>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public ConferenceRoom get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(ConferenceRoom.class, id);
    }

    @Override
    public List<ConferenceRoom> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM ConferenceRoom", ConferenceRoom.class).getResultList();
    }

    @Override
    public void save(ConferenceRoom conferenceRoom) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(conferenceRoom);
    }

    @Override
    public void update(ConferenceRoom conferenceRoom) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(conferenceRoom);
    }

    @Override
    public void delete(ConferenceRoom conferenceRoom) {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(conferenceRoom);
    }
}
