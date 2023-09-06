package assignment;

import java.util.ArrayList;

/**
 * ClassName:FindDifferenceSet
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20239:12 pm
 * @Version 1.0
 */
public class FindDifferenceSet {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ArrayList ll = new ArrayList();

        ls.add("春");
        ls.add("眠");
        ls.add("不");
        ls.add("绝");
        ls.add("晓");

        ll.add("春");
        ll.add("眠");
        ll.add("不");
        ll.add("绝");
        ll.add("晓");
        ll.add("没");
        ll.add("睡");
        ll.add("醒");
        ll.add("好");
        ll.add("困");
        ll.add("啊");
        System.out.println("ll size " + ll.size());
        System.out.println("ls size " + ls.size());
        findDifferenceSet(ll, ls);

    }

    private static void findDifferenceSet(ArrayList l1, ArrayList l2) {
        ArrayList ll = (ArrayList) l1.clone();
        ArrayList ls = (ArrayList) l2.clone();
        ArrayList temp = null;
        if (ll.size() > ls.size()) {
            temp = ll;
            ll = ls;
            ls = (ArrayList) temp.clone();
        }



          ls.removeAll(ll);


        System.out.println("差集元素" + ls.size() + "个" + ls.toString());


    }

}
