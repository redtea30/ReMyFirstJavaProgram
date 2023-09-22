package src.assignment0911;

import java.util.stream.IntStream;

public class AvgPow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        for (int i : arr) {
//            i = (int) Math.pow(i, 2);
//        }

        IntStream stream = IntStream.of(arr);
        int avgPow = 0;
        System.out.println(stream.count());
        for (int i : arr) {
            avgPow += Math.pow(i, 2);
        }
        System.out.println(avgPow);
    }
}
