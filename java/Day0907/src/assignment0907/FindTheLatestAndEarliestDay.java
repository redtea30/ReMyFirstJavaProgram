package assignment0907;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

/**
 * ClassName:FindTheLatestAndEaLestDay
 * Package: assignment0907
 * Description:
 *
 * @Author Neko
 * @Create 7/9/20238:34 pm
 * @Version 1.0
 */
public class FindTheLatestAndEarliestDay {
    HashSet hs = new HashSet();
    Date date = new Date(2022 - 1900, 5, 25);
    Date date1 = new Date(2021 - 1900, 11, 1);
    Date date2 = new Date(1980 - 1900, 6, 8);
    Date date3 = new Date(1956 - 1900, 9, 3);
    Date date4 = new Date(1967 - 1900, 1, 19);
    Date date5 = new Date(1942 - 1900, 8, 14);
    Date date6 = new Date(2015 - 1900, 2, 28);
    Date date7 = new Date(1991 - 1900, 12, 24);
    Date date8 = new Date(1973 - 1900, 4, 5);
    Date date9 = new Date(2006 - 1900, 7, 31);

    public static void main(String[] args) {
        FindTheLatestAndEarliestDay test = new FindTheLatestAndEarliestDay();
        test.addAllToSet();
        test.findTheEarliestDay();
        test.findTheLargestDay();

    }

    private void addAllToSet() {
        hs.add(date);
        hs.add(date1);
        hs.add(date2);
        hs.add(date3);
        hs.add(date4);
        hs.add(date5);
        hs.add(date6);
        hs.add(date7);
        hs.add(date8);
        hs.add(date9);
    }

    private void findTheEarliestDay() {

        System.out.println(Collections.min(hs).toString());
    }

    /**
     * Date类型直接加日期会直接+1900,需要减掉
     */
    private void findTheLargestDay() {
        Date temp = (Date) Collections.max(hs);
        ZoneId zone = ZoneId.systemDefault();
        LocalDate ld = temp.toInstant().atZone(zone).toLocalDate();
        System.out.println(ld);
    }
}
