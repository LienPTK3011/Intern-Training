package com.booking.project.Infrastructure;

import com.booking.project.Domain.Seat;
import com.booking.project.Domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository(value = "UserDao")
@Transactional(rollbackFor = Exception.class)
public class UserDao implements Dao<User>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User get(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public void update(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void delete(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.remove(user);
    }
}
