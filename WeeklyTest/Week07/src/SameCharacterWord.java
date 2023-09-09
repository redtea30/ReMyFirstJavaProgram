import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName:SameCharacterWord
 * Package: PACKAGE_NAME
 * Description:给定两个字符串 `s` 和 `t` ，编写一个函数来判断 `t` 是否是 `s` 的字母异位词。
 * **注意：**若 `s` 和 `t` 中每个字符出现的次数都相同，则称 `s` 和 `t` 互为字母异位词。
 *
 * @Author Neko
 * @Create 9/9/20239:30 am
 * @Version 1.0
 */
public class SameCharacterWord {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s1 = "rat", t1 = "car";

        System.out.println(countCharacterAppearTime(s, t));
        System.out.println(countCharacterAppearTime(s1, t1));


    }


    /**
     * 最原始的做法，有点蠢
     *
     * @param s
     * @param s2
     * @return
     */
    private static boolean countCharacterAppearTime(String s, String s2) {
        TreeSet setTemp = new TreeSet();
        for (int i = 0; i < s.length(); i++) {
            setTemp.add(s.charAt(i));
        }

        int[] count = new int[setTemp.size()];
        int index = 0;

        Iterator ite = setTemp.iterator();
        while (ite.hasNext()) {
            String tempStr = ite.next().toString();
            for (int i = 0; i < s.length(); i++) {
                String charTemp = String.valueOf(s.charAt(i));
                if (tempStr.equals(charTemp)) {
                    count[index]++;
                }
            }
            index++;
        }


        TreeSet setTemp2 = new TreeSet();
        for (int i = 0; i < s2.length(); i++) {
            setTemp2.add(s2.charAt(i));
        }

        int[] count2 = new int[setTemp2.size()];
        int index2 = 0;

        Iterator ite2 = setTemp2.iterator();
        while (ite2.hasNext()) {
            String tempStr2 = ite2.next().toString();
            for (int i = 0; i < s2.length(); i++) {
                String charTemp2 = String.valueOf(s2.charAt(i));
                if (tempStr2.equals(charTemp2)) {
                    count2[index2]++;
                }
            }
            index2++;
        }

        for (Object i : setTemp) {
            if (!(setTemp2.contains(i))) return false;
        }

        if (count.length != count2.length) return false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != count2[i]) return false;
        }

        return true;

    }
}
/*
        HashMap mapTemp = new HashMap();

        for (int i = 0; i < s.length(); i++) {

            mapTemp.compute(setTemp.size(), (o, o2) -> {
                Integer value = (Integer) o2;
                if (o2 == null) {
                    value = 1;
                    o2 = value;
                    return 1;
                }
                value++;
                o2 = value;
                return value;
            });

        }

        System.out.println(mapTemp.values());
*/