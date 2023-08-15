/**
 * ClassName:GirlFriend
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20237:53 pm
 * @Version 1.0
 */
public class GirlFriend {
    //**2、**定义一个女朋友类（GirlFriend）女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
    //我女朋友叫凤姐,身高155.0厘米,体重130.0斤
    //女朋友帮我洗衣服
    //女朋友给我做饭
    String name;
    float height;
    float weight;

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }

    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,体重" + weight + "斤");
    }
}

class Test {
    public static void main(String[] args) {
        GirlFriend chen = new GirlFriend();
        chen.name = "chen";
        chen.height = 55.0f;
        chen.weight = 170.0f;
        chen.wash();
        chen.cook();
        chen.show();

    }
}
