package src.hashtable;

import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable(16);
        Hashtable hashtable3 = new Hashtable(16, 0.75f);
        hashtable.put(1, "testList1");
        hashtable.put(2, "testList2");
        hashtable.put(3, "testList3");
        hashtable.put(4, "testList4");
        Hashtable<Integer, String> hashtable4 = new Hashtable<Integer, String>(hashtable);
        hashtable.forEach((k, v) -> System.out.println(k + "-->" + v));










        
    }
}
