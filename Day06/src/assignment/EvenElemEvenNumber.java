package assignment;

/**
 * ClassName:EvenListEvenNmber
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20234:32 pm
 * @Version 1.0
 */
public class EvenElemEvenNumber {
    public static void main(String[] args) {
        //3．需求：求出数组中索引与索引对应的元素都是奇数的元素
        //分析：
        //1、遍历数组
        //2、判断索引是否是奇数（索引 % 2 != 0）
        //3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)
        //4、满足条件输出结果

        //生成随机数组
/*
        for (int i=0;i<100;i++){
           int k= (int) (Math.random()*100);
            System.out.print(k +",");
        }
*/

        int arr[] = {58, 41, 57, 15, 37, 76, 50, 6, 1, 34, 5, 95, 48, 31, 86, 60, 49, 18, 79, 9, 87, 84, 23, 44, 62, 21, 57, 28, 16, 85, 0, 69, 38, 33, 70, 99, 73, 29, 31, 50, 17, 81, 18, 31, 13, 79, 10, 96, 65, 83, 46, 24, 92, 25, 49, 26, 83, 66, 19, 29, 81, 86, 67, 78, 41, 51, 20, 44, 94, 57, 95, 43, 42, 21, 53, 77, 63, 40, 68, 76, 34, 34, 22, 32, 96, 28, 5, 33, 66, 44, 30, 6, 4, 18, 22, 41, 32, 46, 5, 92,};
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 != 0) {
                if (arr[i]%2!=0) {
                    System.out.println(i+"-位数  "+arr[i]+"-值");
                }
            }


        }

    }
}
