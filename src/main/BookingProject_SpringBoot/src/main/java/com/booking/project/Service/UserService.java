package com.booking.project.Service;

import com.booking.project.Domain.User;
import com.booking.project.Infrastructure.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.getAll();
    }
    public User findById(final int id) {
        return userDao.get(id);
    }
    public void save(final User room) {
        userDao.save(room);
    }
    public void update(final User room) {
        userDao.update(room);
    }
    public void delete(final int id) {
        User room = userDao.get(id);
        if (room != null) {
            userDao.delete(room);
        }
    }
}
