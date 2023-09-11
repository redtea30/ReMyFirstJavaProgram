package assignment0911;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Birthday {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(1980, 9, 05);
        LocalDate ld2 = LocalDate.of(1980, 9, 07);
        LocalDate ld3 = LocalDate.of(1980, 9, 15);
        LocalDate ld4 = LocalDate.of(1980, 3, 03);
        LocalDate ld5 = LocalDate.of(1980, 4, 03);
        LocalDate ld6 = LocalDate.of(1980, 5, 03);


        //LocalDate now = LocalDate.of(2023, 9, 1);

        Map<Integer, LocalDate> map = new HashMap<Integer, LocalDate>();
        map.put(1, ld1);
        map.put(2, ld2);
        map.put(3, ld3);
        map.put(4, ld4);
        map.put(5, ld5);
        map.put(6, ld6);

        LocalDate now = LocalDate.of(1993, 9, 02);
        map.entrySet().stream()
                .filter(new Predicate<Map.Entry<Integer, LocalDate>>() {
                    @Override
                    public boolean test(Map.Entry<Integer, LocalDate> integerLocalDateEntry) {

                        return isNearBirthday(integerLocalDateEntry.getValue(), now);
                    }
                }).map(new Function<Map.Entry<Integer, LocalDate>, Object>() {
                    @Override
                    public Object apply(Map.Entry<Integer, LocalDate> integerLocalDateEntry) {
                        String temp1 = integerLocalDateEntry.getValue().toString();

                        return temp1;
                    }
                }).forEach(new Consumer<Object>() {

                    @Override
                    public void accept(Object o) {
                        String temp2 = (String) o;
                        System.out.println(o.toString());
                    }
                });


    }

    static boolean isNearBirthday(LocalDate birthday, LocalDate now) {
        if (birthday.getMonth().equals(now.getMonth())) {
            int inttemp = birthday.getDayOfMonth() - now.getDayOfMonth();
            if (inttemp > -7 && inttemp < 7) return true;
            return false;
        }
        return false;
    }
}