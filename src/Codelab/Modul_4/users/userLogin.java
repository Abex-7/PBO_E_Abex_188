package Codelab.Modul_4.users;

public abstract class userLogin {
    protected String userName;
    protected String userPassw;

    public userLogin(String userName, String userPassw) {
        this.userName = userName;
        this.userPassw = userPassw;
    }

    public abstract void login();

    abstract void displaymenu();
}
