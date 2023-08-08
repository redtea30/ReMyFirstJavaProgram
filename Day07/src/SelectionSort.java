/**
 * ClassName:SelectionSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/8/202311:39 am
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
//表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所
//以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了
//吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。

//选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序
//列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素
//中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素
//均排序完毕。

        int[] arr = new int[]{9, 1, 3, 4, 54, 56, 23, 22, 20, 43};

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int minIndex = i;//index存储的是第几位
            for (int j = i; j < arr.length; j++) {//这个循环寻找index为i时后买你的最小元素
                if (arr[j] < current) {
                    minIndex = j;
                }
            }
            arr[i] = arr[minIndex];//这一步进行交换，不用新建temp，前面已经建了合适的变量
            arr[minIndex] = current;
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
