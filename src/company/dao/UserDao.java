package company.dao;

import company.model.User;

import java.util.LinkedList;

public class UserDao {
    private LinkedList<User> users;

    public LinkedList<User> getUsers() {
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }
}
