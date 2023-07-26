package constance;

import model.UserAccount;

public class AppController {
    private static AppController instance = new AppController();
    private UserAccount user;

    private AppController(){}

    public static AppController getInstance() {
        return instance;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

}
