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

    @Override
    void push(Object element) {
        isFull();
        stack[count++] = element;
    }

    @Override
    Object pop() {
        return stack[count--];//先这么写，测试功能是否运行
    }

    @Override
    Object peek() {
        return stack[count];
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
        return this == obj;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void isFull() {
        if (count > stack.length - 1) expandArr();
    }

    public void expandArr() {
        stack = Arrays.copyOf(stack, (int) ((count * 1.5) + 10));
    }
}
