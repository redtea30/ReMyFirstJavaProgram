import java.util.LinkedList;
import java.util.Objects;

/**
 * ClassName:ParlindrominNumTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20235:08 pm
 * @Version 1.0
 */
public class PalindromicNumTest {
    public static void main(String[] args) {
//LinkedList集合练习
//编写一个方法，接受一个LinkedList作为参数，并检查它是否是一个回文集合(正着读和倒着读都一样，如1->2->3->2->1)。
        LinkedList ll = new LinkedList();
        ll.add(0, 1);
        ll.add(ll.toArray().length, 1);

        ll.add(1, 2);
        ll.add(ll.toArray().length - 1, 2);

        ll.add(2, 3);
        ll.add(ll.toArray().length - 2, 3);

        ll.add(3, 4);
        ll.add(ll.toArray().length - 3, 4);

        ll.add(4, 5);
        ll.add(ll.toArray().length - 4, 5);

        ll.add(5, 999);
        ll.add(ll.toArray().length - 5, 999);


        for (int i = 0; i < ll.toArray().length >> 1; i++) {
            if (!(Objects.equals(ll.pollFirst(), ll.pollLast()))) {
                System.out.println("不是回文字符串,not palindromic Num");
                System.exit(1);
            }
            ;
        }
        System.out.println("是回文数字，is palindromic num");

    }


}
