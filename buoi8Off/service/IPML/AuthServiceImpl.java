package buoi8Off.service.IPML;

import buoi8Off.models.Account;
import buoi8Off.models.Address;
import buoi8Off.models.Role;
import buoi8Off.models.Status;
import buoi8Off.service.Interface.AuthService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    Scanner sc = new Scanner(System.in);
    List<Account> accounts = new ArrayList<>();
    Account curAccount = null;
    int cnt = 0;

    public AuthServiceImpl() {
        accounts.add(new Account("001", "Admin", 18, new Address("Xuan Phuong", "Bac Tu Liem"), "17/04/2005", "admin", "123456", Role.AMIN, Status.ACTIVE));
        accounts.add(new Account("002", "User", 20, new Address("Hai Bang", "Hai Phong"), "10/05/2003", "user", "123456", Role.USER, Status.ACTIVE));
    }

    public Account getCurAccount() {
        return curAccount;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public void login(Scanner sc) {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                curAccount = account;
                System.out.println("Login success!");
                return;
            }
        }
        cnt++;
        if (cnt == 3) {
            System.out.println("Bị BAN 15p nhé :>");
            curAccount.setStatus(Status.BAN);
            return;
        }
        System.out.println("Sai tài khoản hoặc mật khẩu");
        login(sc);
    }

    @Override
    public void logout() {
        if (curAccount != null) {
            curAccount = null;
            System.out.println("Logout success!");
            return;
        }
        System.out.println("Invalid current account here!");
    }

    @Override
    public boolean changePassword(String userName, String oldPassword, String newPassword) {
        if (curAccount.getUsername().equals(userName) && curAccount.getPassword().equals(oldPassword)) {
            curAccount.setPassword(newPassword);
            return true;
        }
        return false;
    }


}
