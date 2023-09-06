import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * ClassName:RemoveTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20232:41 pm
 * @Version 1.0
 */
public class RemoveTest {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("大狗");
        arr.add("二狗");
        arr.add("三狗");
        arr.add("四狗");
        arr.add("五狗");
        arr.add("六狗");
        arr.add("七狗");
        arr.add("八狗");

        //再建一个数组，存储已存在的数据
        ArrayList arr2 = (ArrayList) arr.clone();
        ArrayList arr3 = (ArrayList) arr.clone();


        //for i 方式 进行删除
        String wantDelete = "三狗";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(wantDelete)) {
                arr.remove(i);
                i--;
            }
        }
        //遍历输出
        arr.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println((String) o);
            }
        });


        System.out.println("way2");
        //使用Iterator的remove()方法进行删除
        Iterator ite = arr2.iterator();
        while (ite.hasNext()) {
            //Object temp = ite.next();
            //这句能合在一起
            if (ite.next().equals(wantDelete)) ite.remove();
        }
        //增强for循环遍历
        for (Object t : arr2) {
            System.out.println(t);
        }


    }

}
