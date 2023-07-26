package controller;

import constance.AppController;
import model.UserAccount;
import repository.UserAccountRepository;

public class LoginController {

    private UserAccountRepository userAccountRepository;

    public LoginController() {
        userAccountRepository = new UserAccountRepository();
    }

    public void login(String username, String password) throws Exception {
        UserAccount user = userAccountRepository.login(username, password);
        AppController.getInstance().setUser(user);
    }
}
