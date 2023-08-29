package assignment0829;

import java.util.Arrays;

/**
 * ClassName:StackTest
 * Package: assignment0829
 * Description:
 *
 * @Author Neko
 * @Create 29/8/20237:26 pm
 * @Version 1.0
 */
public class StackMain extends Stack {
    Object[] stack;
    int count = 0;

    public StackMain() {
    }


    @Override
    void push(Object element) {
        isFull();
        stack[count++] = element;
    }

    @Override
    Object pop() {
        Object temp = stack[count - 1];
//      if (count == 0) return null;
//        return stack[--count];//先这么写，测试功能是否运行
        System.arraycopy(stack, 0, stack, 0, count - 1);
        System.arraycopy(stack, count, stack, count - 1, stack.length - count);
        count--;
        return temp;
    }

    @Override
    Object peek() {
        if (count == 0) return null;
        return stack[count - 1];
    }

    @Override
    boolean isEmpty() {
        return count <= 0;
    }

    @Override
    int size() {
        return count;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "StackMain{" +
                "stack=" + Arrays.toString(stack) +
                ", count=" + count +
                '}';
    }

    public void isFull() {
        if (this.stack == null || count > this.stack.length - 1) expandArr();
    }

    public void expandArr() {
        if (stack == null) stack = new Object[10];
        else stack = Arrays.copyOf(stack, count * 2);
    }
}
