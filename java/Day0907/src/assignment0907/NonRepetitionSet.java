package assignment0907;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ClassName:NonRepetationSet
 * Package: assignment0907
 * Description:昨天的题改动下，通过set接口进行去重
 *
 * @Author Neko
 * @Create 7/9/202310:50 pm
 * @Version 1.0
 */
public class NonRepetitionSet {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();

        ls.add(123);
        ls.add(12);
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        HashSet hs = new HashSet(ls);
        System.out.println(hs.toString());

    }
}
