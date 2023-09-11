package assignment0911;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToSting {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);

        String output = "";
        //我不想这么搞，没意思
        stream.forEach(o -> {
            System.out.print(o);
        });


    }
}
