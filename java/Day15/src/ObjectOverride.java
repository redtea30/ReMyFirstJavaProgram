/**
 * ClassName:ObjectOverride
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 18/8/202311:39 am
 * @Version 1.0
 */
public class ObjectOverride extends Object {
    String stringTest;
    char charTest;
    int intTest;

    public ObjectOverride() {
    }

    public ObjectOverride(String name, char gender, int age) {
        stringTest = name;
        charTest = gender;
        intTest = age;
    }

    @Override
    public String toString() {
        return stringTest + " " + charTest + " " + intTest;
    }

    @Override
    public int hashCode() {
        return intTest;
    }

    public boolean equals(Object obj) {//这里是自动类型提升，从ObjectOverride类提升为 Object类，后面比较的话需要再转回ObjectOverride类
        if (this == obj) {//调用者和obj的地址值相等时
            return true;
        }
        if (obj instanceof ObjectOverride) {
            ObjectOverride oo = (ObjectOverride) obj;//进行强转

            if (oo.intTest == this.intTest || (oo.intTest == 0) && (this.intTest == 0)) {
                return true;

            }
        }

        return false;//上面的for循环完之后还是没有true
    }


}
