package buoi8Off.service.Interface;

import java.util.Scanner;

public interface AuthService {
    public void login(Scanner sc);
    public void logout();
    public boolean changePassword(String userName, String oldPassword, String newPassword);
}
