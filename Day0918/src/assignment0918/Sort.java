package assignment0918;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) throws InterruptedException {
        Integer[] arr = {23, 85, 92, 61, 57, 0, 35, 55, 49, 59, 29, 67, 40, 43, 16, 48, 60, 11, 89, 90, 0, 79, 39, 19, 21, 8, 65, 87, 10, 77, 34, 45, 75, 32, 28, 64, 78, 63, 54, 46, 31, 50, 68, 96, 5, 80, 62, 69, 91, 22, 97, 95, 0, 74, 58, 71, 44};

        List list = Arrays.asList(arr);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                List list1 = list.subList(0, list.size() / 3);
                list1.sort((o1, o2) -> {
                    return (int) o1 - (int) o2;
                });
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                List list2 = list.subList(list.size() / 3, list.size() / 3 * 2);
                list2.sort((o1, o2) -> {
                    return (int) o1 - (int) o2;
                });
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                List list3 = list.subList(list.size() / 3 * 2, list.size());
                list3.sort((o1, o2) -> {
                    return (int) o1 - (int) o2;
                });
            }
        };


        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        while (true) {
            if (!(thread1.isAlive()) && !(thread1.isAlive()) && !(thread1.isAlive())) {
                System.out.println(list);
                break;
            }
        }


    }
}
