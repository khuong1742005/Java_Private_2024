package buoi8Off.service.IPML;

import buoi8Off.models.Account;
import buoi8Off.models.Address;
import buoi8Off.models.Role;
import buoi8Off.models.Status;
import buoi8Off.service.Interface.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {
    List<Account> accounts = new ArrayList<>();

    @Override
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account createNewAccount(Scanner sc) throws Exception{
        System.out.println("Nhập thông tin tài khoản mới:");
        Account a = new Account();
        try{
            System.out.println("Nhập id: ");
            String id = sc.nextLine();
            for(Account account : accounts){
                if (account.getId().equals(id)){
                    throw new Exception("Id đã tồn tại. Vui lòng nhập lại.");
                }
            }
            a.setId(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }


        System.out.println("Nhập tài khoản: ");
        a.setUsername(sc.nextLine());
        System.out.println("Nhập mật khẩu: ");
        a.setPassword(sc.nextLine());
        System.out.println("Nhập họ tên: ");
        a.setFullName(sc.nextLine());
        System.out.println("Nhập tuổi: ");
        a.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên đường: ");
        String street = sc.nextLine();
        System.out.println("Nhâ tên thành phố: ");
        String city = sc.nextLine();
        a.setAddress(new Address(street, city));
        System.out.println("Nhập sinh nhật: ");
        a.setBirthDay(sc.nextLine());
        a.setRole(Role.USER);
        a.setStatus(Status.ACTIVE);
        System.out.println("Account created successfully!");
        accounts.add(a);
        return a;
    }

    @Override
    public Account getAccountByUsername(String username) {
        for(Account account : accounts){
            if (account.getUsername().equals(username)){
                return account;
            }
        }
        return null;
    }

    @Override
    public void deleteAccountByUsername(String username) {
        for(Account account : accounts){
            if (account.getUsername().equals(username)){
                accounts.remove(account);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy tên tài khoản");
    }

    @Override
    public void changeStatus(String username) {
        for(Account account : accounts){
            if (account.getUsername().equals(username)){
                account.setStatus((account.getStatus() == Status.ACTIVE) ? Status.BAN : Status.ACTIVE);
                System.out.println("Thay đổi thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy tên tài khoản");
    }
}
