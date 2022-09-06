package company.service;

import company.model.User;

import java.util.LinkedList;

public interface UserService{
    void addUser(User user);
    User searchUserByID(int userid);
    void removeUserByID(int userid);
    LinkedList<User> getUsers();
}