package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

import java.util.LinkedList;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();{
        userDao.setUsers(new LinkedList<>());
    }

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User searchUserByID(int userID) throws RuntimeException {
        for (User user : userDao.getUsers()) {
            if (user.getId()==userID) return user;
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public void removeUserByID(int userID) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userID==userDao.getUsers().get(i).getId()) userDao.getUsers().remove(userID);
        }
    }

    @Override
    public LinkedList<User> getUsers() {
        return userDao.getUsers();
    }
}
