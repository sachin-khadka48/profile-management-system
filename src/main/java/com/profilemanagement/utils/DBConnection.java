package com.profilemanagement.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/profilemanagementsystem";
            String username = "root";
            String password = "1234"; // your MySQL password

            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Database Connection Failed");
            return null;
        }
    }
}
