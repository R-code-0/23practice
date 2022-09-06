package company;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;
import company.service.impl.UserServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        UserServiceImpl db = new UserServiceImpl();
        db.addUser(user1);
        db.addUser(user2);
        db.addUser(user3);
        try {
        System.out.println(db.searchUserByID(1));
        }
        catch (RuntimeException e){
            System.err.println("Runtime exception " + e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println(db.getUsers());
        db.removeUserByID(2);
        System.out.println(db.getUsers());
    }
}