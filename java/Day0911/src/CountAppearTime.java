package src;

import java.util.HashMap;
import java.util.Map;

public class CountAppearTime {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCounts = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        System.out.println(charCounts);
    }
}
