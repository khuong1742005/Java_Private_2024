package buoi8Off.service.Interface;

import buoi8Off.models.Account;
import buoi8Off.models.Status;

import java.util.List;
import java.util.Scanner;

public interface AccountService {
    public List<Account> getAllAccounts();
    public Account createNewAccount(Scanner sc) throws Exception;
    public Account getAccountByUsername(String username);
    public void deleteAccountByUsername(String username);
    public void changeStatus(String username);
}
