package buoi6Off.service.IMPL;

import buoi6Off.service.IUserService;

public class IUserServiceIMPL implements IUserService {
    @Override
    public boolean login(String username, String password, String role) {
        return false;
    }

    @Override
    public boolean register(String username, String password) {
        return false;
    }

    @Override
    public boolean deleteAccount(String username) {
        return false;
    }

    @Override
    public boolean checkUsernameExisted(String username) {
        return false;
    }

    @Override
    public String displayUser(String username) {
        return "";
    }
}
