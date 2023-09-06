package assignment;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * ClassName:CountNonrepetation
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20238:24 pm
 * @Version 1.0
 */
public class CountNonRepetition {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();

        ls.add(123);
        ls.add(12);
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(3);
        ls.add(4);

        System.out.println("ls的size（） " + ls.size());//ls的size（） 28
        countNonRepetition(ls);


    }

    static void countNonRepetition(ArrayList ls) {
        int maxCount = 0;

        for (int i = 0; i < ls.size() - 1; i++) {
            ArrayList temp = (ArrayList) ls.clone();
            int intTemp = (int) temp.remove(i);
            if (!(temp.contains(intTemp))) maxCount++;
        }
        System.out.println(maxCount + " 个数字不重复");

        int maxCount1 = ls.size() - 1;//就是temp 的size（）
        NumComparator nc = new NumComparator();
        for (int i = 0; i < ls.size() - 1; i++) {
            ArrayList temp = (ArrayList) ls.clone();
            Object obj = temp.remove(i);
            for (int j = 0; j < temp.size(); j++) {
                if (nc.compare(temp.get(j), obj) == 0) {
                    maxCount1--;
                    break;
                }

            }
        }
        System.out.println(maxCount1 + " 个数字不重复");


    }



    //创建一个新的集合，挨个往里面塞元素，有重复的就不赛
}

class NumComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer int1 = (Integer) o1;
        Integer int2 = (Integer) o2;
        return int1 - int2;
    }
}
