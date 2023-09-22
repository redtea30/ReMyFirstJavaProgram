package src.assignment0911;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class GetWantedValue {
    public static void main(String[] args) {
//所有元素之和
//最⼤值
//最⼩值
        Integer[] arr = {10, 20, 30, 40};

        Stream<Integer> stream = Arrays.stream(arr);
        Optional<Integer> temp = stream.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        Integer output = temp.get();
        System.out.println(output);


        //max
        Stream<Integer> stream1 = Arrays.stream(arr);
        Optional<Integer> maxInt = stream1.max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        });
        Integer maxInt1 = maxInt.get();
        System.out.println(maxInt1);

        //min
        Stream<Integer> stream2 = Arrays.stream(arr);

        Optional<Integer> minInt = stream2.min((o1, o2) -> {
            return o1.compareTo(o2);
            //使用compareTo可以直接输出结果
            // 不然就得使用-(o1-o2);
        });
        Integer minInt1 = minInt.get();
        System.out.println(minInt1);

    }
}
