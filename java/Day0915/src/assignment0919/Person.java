/**
 * Descprition: 测试GSon和Lombok
 * lombok的使用如下
 */

package assignment0919;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Accessors
@ToString
@EqualsAndHashCode
public class Person implements Cloneable, Serializable {

    private String name;
    private String no;
    private Person son;

    @Override
    public Object clone() {
        return null;
    }
}
