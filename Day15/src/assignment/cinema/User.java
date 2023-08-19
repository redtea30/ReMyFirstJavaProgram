package assignment.cinema;

/**
 * ClassName:User
 * Package: assignment.cinema
 * Description:
 *
 * @Author Neko
 * @Create 19/8/20234:20 pm
 * @Version 1.0
 */
public class User {
    private String username;
    private Long phone;
    private String password;
    private int role;//1是管理员，2是普通用户

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        if (role == 1 || role == 2) {
            this.role = role;
        }
    }

    public String getUsername() {
        return this.username;
    }

    public long getPhone() {
        return this.phone;
    }

    public String getPassword() {
        return this.password;
    }

    public int getRole() {
        return this.role;
    }

    public User() {
    }

    public User(String username, Long phone, String password, int role) {
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

}
