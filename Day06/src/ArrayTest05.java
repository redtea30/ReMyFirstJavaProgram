/**
 * ClassName:ArrayTest05
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20232:32 pm
 * @Version 1.0
 */
public class ArrayTest05 {
    public static void main(String[] args) {
//创建长度为10的int型数组，初始值为1、2、3、4、5、6、7、8、9、10，按照下列规则更新数组中每一个元素的值
//a) 数组的第n位元素 = 数组的第n-1位元素 * 数组的第n位元素 * 数组的第n+1位元素
//b) 如果n = 0，则数组的第n-1位元素的值按1计算。
//c) 如果n = 9，则数组的第n+1位元素的值按1计算。
//   更新后输出数组元素值应为: 2，6，24，60，12，210，336，504，720，90

        //用旧数组做不了，必须用新数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[arr.length];//生成新数组承接值
        for (int i = 0; i <= arr.length - 2; i++) {
            if (i == 0) {
                arr2[0] = arr[0] * arr[1];
            } else if (i == 8) {//待优化，可以取到最后一个元素
                arr2[8] = arr[7] * arr[8] * arr[9];
                arr2[9] = arr[8] * arr[9];
            } else {
                arr2[i] = arr[i - 1] * arr[i] * arr[i + 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
