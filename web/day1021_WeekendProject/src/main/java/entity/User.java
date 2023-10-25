package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Package-name: entity
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 21/10/2023-10-2023 09-40
 * Describe：
 */
@Data
@NoArgsConstructor
public class User {
    private String username;//
    private String name;//
    private String password;//
    private String birth;//
    private String phone;
    private String email;
    private String create_time;

    //  忘了
    public User(String username, String name, String password, String birth, String phone, String email) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.create_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());    }


    //  用于用户注册使用
    public User(String username, String name, String password, String birth, String email) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.birth = birth;
        this.create_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.email = email;
    }
}
