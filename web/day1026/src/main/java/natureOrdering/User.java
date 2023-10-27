package natureOrdering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 26-10-2023  09:08
 * Describe：实现Comparable接口实现自然排序
 */

@Data
@Getter
@Setter
@AllArgsConstructor
public class User implements Comparable<User> {
    private Integer age;
    private String name;
    private String email;


    public int compareTo(User o) {
        return this.age - o.age;
    }
}
