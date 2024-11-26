package buoi7Off.service.IMPL;

import buoi7Off.models.Role;
import buoi7Off.models.User;
import buoi7Off.service.IUserService;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserServiceIMPL implements IUserService {
    private ArrayList<User> users = new ArrayList<>();
    private User curUser;
    public Scanner sc = new Scanner(System.in);


    public IUserServiceIMPL() {
        users.add(new User("001", "Admin", "admin", "123456", Role.AMIN));
        users.add(new User("001", "User", "user", "123456", Role.USER));
        curUser = null;
    }

    public User getCurUser() {
        return curUser;
    }

    @Override
    public void login() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                curUser = user;
                System.out.println("Login successfully!");
                return;
            }
        }
        System.out.println("Invalid email or password!");
    }

    @Override
    public void logout() {
        if (curUser != null) {
            System.out.println("Logout successfully!");
            curUser = null;
        } else {
            System.out.println("No user is currently logged in!");
        }
    }

}
