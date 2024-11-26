package buoi6Off.service;

public interface IUserService {
    boolean login(String username, String password, String role);
    boolean register(String username, String password);
    boolean deleteAccount(String username);
    boolean checkUsernameExisted(String username);
    String displayUser(String username);
}
