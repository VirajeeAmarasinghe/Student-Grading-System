package BusinessLogic;

public class User {

    private String username; //this variable is to store user name
    private String password; //this variable is to store password
    private String userLevel; //variable to store user level

    public User() {
    }

    public User(String username, String password, String userlevel) {
        this.username = username;
        this.password = password;
        this.userLevel = userlevel;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserLevel() {
        return userLevel;
    }

}
