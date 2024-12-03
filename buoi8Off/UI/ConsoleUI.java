package buoi8Off.UI;

import buoi8Off.models.Account;
import buoi8Off.models.Address;
import buoi8Off.models.Role;
import buoi8Off.models.Status;
import buoi8Off.service.IPML.AccountServiceImpl;
import buoi8Off.service.IPML.AuthServiceImpl;
import buoi8Off.service.Interface.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    Scanner sc = new Scanner(System.in);
    AuthServiceImpl authImpl = new AuthServiceImpl();
    AccountServiceImpl accountImpl = new AccountServiceImpl();
    List<Account> accounts = new ArrayList<>();

    public void AdminUI() throws Exception {
        System.out.println("===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN =====");
        System.out.println("Xin chào ADMIN: " + authImpl.getCurAccount().getUsername());
        while (true) {
            System.out.println("Chọn một trong các chức năng sau: ");
            System.out.println("1. Xem danh sách tài khoản");
            System.out.println("2. Tạo tài khoản mới");
            System.out.println("3. Tìm kiếm tài khoản theo username");
            System.out.println("4. Xóa tài khoản");
            System.out.println("5. Thay đổi trạng thái tài khoản (ACTIVE <-> BAN)");
            System.out.println("6. Xem thông tin các nhân");
            System.out.println("7. Đăng xuất");
            System.out.println("---------------------------------------");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách tài khoản: ");
                    List<Account> ac = new ArrayList<>();
                    ac = accountImpl.getAllAccounts();
                    for (Account a : ac) {
                        System.out.println(a.toString());
                    }
                    break;
                case 2:

                    accounts.add(accountImpl.createNewAccount(sc));
                    break;
                case 3:
                    System.out.println("Nhập tên tài khoản muốn tìm: ");
                    String username = sc.nextLine();
                    Account aa = new Account();
                    aa = accountImpl.getAccountByUsername(username);
                    if (aa == null) {
                        System.out.println("Không tìm thấy tài khoản");
                    } else
                        System.out.println(aa.toString());
                    break;
                case 4:
                    System.out.println("Nhập tên tài khoản muốn xóa: ");
                    String u = sc.nextLine();
                    accountImpl.deleteAccountByUsername(u);
                    break;
                case 5:
                    System.out.println("Nhập tên tài khoản muốn thay đổi trạng thái: ");
                    String uname = sc.nextLine();
                    accountImpl.changeStatus(uname);
                    break;
                case 6:
                    System.out.println("Thông tin cá nhân: ");
                    Account curaccount = authImpl.getCurAccount();
                    System.out.println(curaccount.toString());
                    break;
                case 0:
                    authImpl.logout();
                    return;
            }
        }


    }

    public void UserUI() {
        System.out.println("===== HỆ THỐNG NGƯỜI DÙNG =====");
        System.out.println("Xin chào USER: " + authImpl.getCurAccount().getUsername());
        while (true) {
            System.out.println("Chọn một trong các chức năng sau: ");
            System.out.println("1. Đổi mật khẩu");
            System.out.println("2. Xem thông tin cá nhân");
            System.out.println("0. Đăng xuất");
            System.out.println("---------------------------------------");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên tài khoản: ");
                    String username = sc.nextLine();
                    System.out.println("Nhập mật khẩu cũ: ");
                    String oldPassword = sc.nextLine();
                    System.out.println("Nhập mật khẩu mới: ");
                    String newPassword = sc.nextLine();
                    if (authImpl.changePassword(username, oldPassword, newPassword) == true) {
                        System.out.println("Đổi thành công");
                        break;

                    } else System.out.println("Đổi thất bại");
                    break;
                case 2:
                    System.out.println("Thông tin cá nhân: ");
                    Account acc = authImpl.getCurAccount();
                    System.out.println(acc.toString());
                    break;
                case 0:
                    authImpl.logout();
                    return;
            }
        }
    }

    public void UI() throws Exception {
        authImpl.login(sc);
        if (authImpl.getCurAccount().getRole().equals(Role.AMIN)) AdminUI();
        else UserUI();
    }
}
