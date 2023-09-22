/**
 * ClassName:Sort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/9/20239:21 am
 * @Version 1.0
 */
public class Sort {

    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("jkk", 3);
        stu[1] = new Student("jkk", 2);
        stu[2] = new Student("jkk", 1);

        //倒序实现对象数组排序
        System.out.println(stu[2].toString());
        System.out.println(stu[1].toString());
        System.out.println(stu[0].toString());

    }


    public static void bubbleSort(Student[] stu) {
        for (int i = 0; i < stu.length - i; i++) {
            for (int j = 0; j < stu.length; j++) {
                if (stu[j].getAge() < stu[j + 1].getAge()) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
    }
}
