package entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Package-name: entity
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 25-10-2023  18:49
 * Describe：
 */

@Data
public class User implements Serializable {
    //  据说通过继承序列化可以减少bug
    private String username;
    private String password;
    private String email;

    @Serial
    private static final long serialVersionUID = 1L;

}
