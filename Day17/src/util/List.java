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
    private Object[] arr;
    private int count;
    private int capacity;

    public List() {
    }

    public List(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    public void add(Object obj) {
        expandArr();
        arr[count++] = obj;
    }


    private void expandArr() {
        if (count == arr.length) {
            Arrays.copyOf(arr, arr.length * 2);
        }
    }

    private void deleteValue(Object obj,int index) {

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
}
