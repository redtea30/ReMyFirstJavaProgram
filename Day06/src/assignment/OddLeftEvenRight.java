package assignment;

/**
 * ClassName:OddLeftEvenRight
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:50 pm
 * @Version 1.0
 */
public class OddLeftEvenRight {
    public static void main(String[] args) {
        //8. 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，
        //偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {//第一次循环找奇偶个数
            if (arr[i] % 2 != 0) countOdd++;
            else countEven++;
        }
        System.out.println("奇数个数" + countOdd + "偶数个数" + countEven);
        int[] oddArr = new int[countOdd];
        int[] evenArr = new int[countEven];
        System.out.println(countOdd + "odd");
        System.out.println(countEven + "even");

        for (int i = 0; i < arr.length; i++) {//将数字分别输入到两个数组中
            int temp = arr[i];
            if ((arr[i]) % 2 == 0) {
                if (countEven != 0) {
                    evenArr[--countEven] = temp;
                } else {
                    evenArr[0] = temp;
                }
            } else {
                if (countOdd != 0) {
                    oddArr[--countOdd] = temp;
                } else {
                    oddArr[0] = temp;
                }
            }
        }

        int[] finalArr = new int[(oddArr.length + evenArr.length)];
        for (int i = 0; i < arr.length; i++) {
            if (i < oddArr.length ) {
                finalArr[i] = oddArr[i];
            } else {
                finalArr[i] = evenArr[i - oddArr.length];
            }

            System.out.print(finalArr[i] + ",");
        }

    }
}




