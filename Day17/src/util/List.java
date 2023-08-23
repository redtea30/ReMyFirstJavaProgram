package util;

import java.util.Arrays;

/**
 * ClassName:List
 * Package: util
 * Description:
 *
 * @Author Neko
 * @Create 22/8/202311:59 am
 * @Version 1.0
 */
public class List {
    private Object[] arr = new Object[2];
    private int count = 0;
    private int capacity;

    public List() {
    }

    public List(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    public void add(Object obj) {
        // 判断能否存下
        if (this.count + 1 > arr.length){
            // 存不下
            expandArr();
        }
//        arr[size] = obj;
//        size ++;
        arr[count ++] = obj;
    }


    private void expandArr() {
        arr = Arrays.copyOf(arr, arr.length  * 2);

    }

    public void deleteValue(Object obj, int index) {
        System.arraycopy(arr, index, arr, index - 1, (count--) - index);
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object searchEle(int index) {
        if (index < 0 || index >= arr.length) {
            return null;
        }
        return arr[index];
    }



    public String toString() {
        String str = "共有" + count + "个元素，\nList[ ";
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ", \n";
            }
        }
        str += " ]";
        return str;
    }
}
