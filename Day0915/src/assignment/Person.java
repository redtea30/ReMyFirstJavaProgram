/**
 * Descprition: 测试GSon和Lombok
 * lombok的使用如下
 */

package assignment;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Accessors
@ToString
@EqualsAndHashCode
public class Person implements Cloneable {

    private String name;
    private String no;
    private Person son;

    @Override
    public Object clone() {
        return null;
    }
}
