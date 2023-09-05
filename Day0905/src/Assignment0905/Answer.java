package Assignment0905;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * ClassName:Answer
 * Package: Assignment0905
 * Description:
 *
 * @Author Neko
 * @Create 5/9/20237:49 pm
 * @Version 1.0
 */
public class Answer {
    public static void main(String[] args) {
        //Q1
        Vector vc = new Vector();
        Student stu = new Student("王");
        Student stu1 = new Student("张");
        Student stu2 = new Student("李");
        Student stu3 = new Student("赵");
        Student stu4 = new Student("孙");
        Student stu5 = new Student("韩");

        System.out.println("vc当前元素个数" + vc.size());//0
        vc.add(stu);
        vc.add(stu1);
        vc.add(stu2);
        vc.add(stu3);
        vc.add(stu4);
        vc.add(stu5);
        System.out.println("vc当前元素个数" + vc.size());//6
        deleteAStudent("王", vc);//张李赵孙韩

        //Q2
        Vector vc1 = new Vector();
        Commodity cm = new Commodity(11.1);
        Commodity cm1 = new Commodity(22.2);
        Commodity cm2 = new Commodity(33.3);
        Commodity cm3 = new Commodity(44.4);
        Commodity cm4 = new Commodity(55.5);
        Commodity cm5 = new Commodity(66.6);
        vc1.add(cm);
        vc1.add(cm1);
        vc1.add(cm2);
        vc1.add(cm3);
        vc1.add(cm4);
        vc1.add(cm5);

        getAvgPrice(vc1);//商品的平均价格为38

        //Q3
        Vector vc2 = new Vector();
        vc2.add(1);
        vc2.add(1);
        vc2.add(1);
        vc2.add(1);
        vc2.add(1);
        vc2.add(1);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(2);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        vc2.add(3);
        calculateAppearTimes(vc2, 2);//数字2出现了8次

        //Q4


    }

    private static void calculateAppearTimes(Vector vc, int intValue) {
        Iterator ite = vc.iterator();
        int appearTimes = 0;
        while (ite.hasNext()) {
            Integer int1 = (int) ite.next();
            if (intValue == int1) {
                appearTimes++;
            }
        }
        System.out.println("数字" + intValue + "出现了" + appearTimes + "次");
    }

    static void getAvgPrice(Vector vc) {
        double result = calculateAvgPrice(vc);
        if (result == -1) System.out.println("当前商品不存在");
        else if (result == -2) System.out.println("输入的商品价格有误");
        else {
            System.out.println("商品的平均价格为" + result);
        }

    }

    /**
     * 计算平均价格，初次使用final数组解决lambda表达式不可赋值问题
     * 妈的，我就是要用lambda表达式赋值
     *
     * @param vc
     * @return
     */
    static double calculateAvgPrice(Vector vc) {
        if (vc == null) return -1;
        final double[] total = {0};
        final boolean[] flag = {false};
        vc.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                if (o instanceof Commodity da) {
                    double price = da.getPrice();
                    if (price < 0) flag[0] = true;
                    total[0] += price;
                }
            }
        });
        if (flag[0]) return -2;
        return total[0] / vc.size();
    }

    static void deleteAStudent(String name1, Vector vc) {
        if (name1 == "" || vc.size() == 0 || name1 == null) {
            System.out.println("当前无法查询");
            return;
        }
        //不能通过迭代器删除，会报错
        for (int i = 0; i < vc.size(); i++) {
            Student stu = (Student) vc.get(i);
            if (stu.getName().equals(name1)) {
                vc.remove(i);
                break;
            }
        }
        showAllStudent(vc);
    }

    /**
     * 打印模块
     *
     * @param vc
     */
    static void showAllStudent(Vector vc) {
        vc.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                if (o instanceof Student stu) System.out.print(stu.getName());
            }
        });
        System.out.println();
    }

}

