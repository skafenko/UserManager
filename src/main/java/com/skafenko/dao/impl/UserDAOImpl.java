
package com.skafenko.dao.impl;

import com.skafenko.dao.UserDAO;
import com.skafenko.entity.User;
import com.skafenko.util.HibernateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {
        System.out.println("UserDAOImpl");
    }

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public long createUser(User user) {
        return (Long) hibernateUtil.create(user);
    }

    @Override
    public User updateUser(User user) {
        return hibernateUtil.update(user);
    }

    @Override
    public void deleteUser(long id) {
        User user = new User();
        user.setId(id);
        hibernateUtil.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return hibernateUtil.fetchAll(User.class);
    }

    @Override
    public User getUser(long id) {
        return hibernateUtil.fetchById(id, User.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers(String userName) {
        String query = "SELECT * FROM Users u WHERE u.name like '%" + userName + "%'";
        List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
        List<User> users = new ArrayList<User>();
        for (Object[] employeeObject : employeeObjects) {
            User user = new User();

            long id = ((BigInteger) employeeObject[0]).longValue();
            String name = (String) employeeObject[1];
            int age = (int) employeeObject[2];
            boolean admin = (boolean) employeeObject[3];
            Date createdDate = (Date) employeeObject[4];
            user.setId(id);
            user.setName(name);
            user.setAge(age);
            user.setAdmin(admin);
            user.setCreatedDate(createdDate);
            users.add(user);
        }
        return users;
    }
}