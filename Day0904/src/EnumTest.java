/**
 * ClassName:EnumTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/9/202311:35 am
 * @Version 1.0
 */
public enum EnumTest {
    monday("this is monday"),
    tuesday("this is Tuesday"),
    wednesday("this is Wednesday"),
    thursday("this is thursday"),
    friday("this is friday"),
    saturday("this is saturday"),
    sunday("this is sunday");
    private String name;

    EnumTest() {
    }

    EnumTest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
