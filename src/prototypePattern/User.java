package prototypePattern;

public class User implements  Cloneable{
    private String username;

    @Override
    protected User clone()  {
        try {
            return (User) super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
            return null;
    }

    private String email;
    private String password;



    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
