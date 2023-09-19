package assignment0919;

/**
 * ClassName:FindTheMinimum
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20234:05 pm
 * @Version 1.0
 */
public class FindTheMinimum {
    public static void main(String[] args) {
        //定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
        //操作步骤：
        //1.定义5个元素数组
        //2.可以使用初始化数组的两种方式之一为数组元素赋值
        //3.遍历数组求数组中的最小值


        int arr[] = {1, 4, 5, 6, 2};

        int minimum = arr[1];
        int whichNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
                whichNum = i;
            }
        }
        System.out.println(minimum + "-minimum  " + whichNum + "-whichNum");
    }
}
