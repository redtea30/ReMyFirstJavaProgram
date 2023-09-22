package src;

import java.util.HashMap;
import java.util.Map;

public class PutRemove {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "安琪拉");
        map.put(2, "妲己");
        map.put(3, "貂蝉");
        map.put(4, "大乔");

// 遍历打印
        for(Integer key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }

// 插入元素
        map.put(5, "小乔");

// 删除元素
        map.remove(1);

// 修改元素
        map.put(2, "孙策");
    }
}
