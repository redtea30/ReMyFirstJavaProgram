package assignment;

import java.util.ArrayList;

/**
 * ClassName:FindIntersection
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20238:54 pm
 * @Version 1.0
 */
public class FindIntersection {
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
        findIntersection( ll,  ls);

    }

    static void findIntersection(ArrayList ll, ArrayList ls) {
        ArrayList temp = null;
        if (ll.size() > ls.size()) {
            temp = ll;
            ll = ls;
            ls = (ArrayList) temp.clone();
        }

        temp.removeAll(temp);
        for (int i = 0; i < ll.size(); i++) {
            String temp1 = (String)ll.get(i);
            if (ls.contains(temp1)) temp.add(temp1);
        }
        System.out.println("交集元素" + temp.size() + "个" + temp.toString());

    }


}
