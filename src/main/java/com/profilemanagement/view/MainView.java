package com.profilemanagement.view;

import com.profilemanagement.controller.UserController;
import java.util.Scanner;

public class MainView {

    Scanner sc = new Scanner(System.in);
    UserController controller = new UserController();

    public void startProgram() {
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addUser();
                case 2 -> viewAllUsers();
                case 3 -> viewUserById();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public void showMenu() {
        System.out.println("\n1. Add User Profile");
        System.out.println("2. View All Users");
        System.out.println("3. View My Profile (by ID)");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }

    public void addUser() {
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean result = controller.addUser(name, email, password);

        if (result) System.out.println("User Added Successfully");
        else System.out.println("Failed");
    }

    public void viewAllUsers() {
        controller.showAllUsers();
    }

    public void viewUserById() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        controller.showUserById(id);
    }

    public static void main(String[] args) {
        new MainView().startProgram();
    }
}