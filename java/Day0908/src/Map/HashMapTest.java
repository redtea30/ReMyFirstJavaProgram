package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:HashMapTest
 * Package: Map
 * Description:泛型的遍历
 *
 * @Author Neko
 * @Create 8/9/20233:52 pm
 * @Version 1.0
 */
public class HashMapTest {


    public static void main(String[] args) {
        int int1 = 1;
        String str1 = "1";

        HashMap<Integer, String> hm = new HashMap();

        hm.put(int1, str1);
        hm.put(2, "s345f");
        hm.put(3, "sqwerf");
        hm.put(4, "ewrsf");
        hm.put(5, "sasdff");
        hm.put(6, "ssdf");
        hm.put(7, "scf");
        hm.put(8, "csf");


        //通过entrySet获取set列表
        Set set = hm.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //通过forEach直接遍历输出
        hm.forEach((int2, str2) -> System.out.println(int2 + "-" + str2));

        //通过KeySet获取key存在的Set列表
        Set<Integer> keySet = hm.keySet();//这就是所有key的列表，通过该列表进行遍历
        for (Integer i : keySet) {
            System.out.println(i + " " + hm.get(i));
        }


    }


}
