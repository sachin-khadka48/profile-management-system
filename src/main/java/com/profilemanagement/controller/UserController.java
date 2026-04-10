package com.profilemanagement.controller;

import com.profilemanagement.dao.UserDAO;
import com.profilemanagement.model.User;

import java.util.List;

public class UserController {

    UserDAO dao = new UserDAO();

    public boolean addUser(String name, String email, String password) {
        User user = new User(name, email, password);
        return dao.insertUser(user);
    }

    public void showAllUsers() {
        List<User> users = dao.getAllUsers();

        for (User u : users) {
            System.out.println(u.getId() + " | " + u.getName() + " | " + u.getEmail());
        }
    }

    public void showUserById(int id) {
        User u = dao.getUserById(id);

        if (u != null) {
            System.out.println("ID: " + u.getId());
            System.out.println("Name: " + u.getName());
            System.out.println("Email: " + u.getEmail());
        } else {
            System.out.println("User not found");
        }
    }
}