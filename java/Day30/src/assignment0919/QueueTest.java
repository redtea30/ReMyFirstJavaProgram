package assignment0919;

import java.util.Arrays;
import java.util.Objects;

/**
 * ClassName:QueueTest
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 30/8/20238:24 pm
 * @Version 1.0
 */
public class QueueTest extends Queue {
    int count = 0;
    Object[] objects = new Object[3];

    /**
     * 将元素插入队尾
     *
     * @param element 要插入的元素
     */
    @Override
    void enqueue(Object element) {
        expand();
        objects[count++] = element;


    }

    /**
     * 移除并返回队首元素
     * 删除第一个元素，并返回
     *
     * @return 队首元素, 如果队列为空时，返回 null
     */
    @Override
    Object dequeue() {
        Object temp = objects[0];
        try {
            System.arraycopy(objects, 1, objects, 0, --count - 1);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return temp;


    }

    /**
     * 返回队首元素，但不移除
     *
     * @return 队首元素
     */
    @Override
    Object peek() {
        if (count == 0) {
            return null;
        }
        return objects[0];
    }

    /**
     * 检查队列是否为空
     *
     * @return 如果队列为空则返回true，否则返回false
     */
    @Override
    boolean isEmpty() {
        if (count > 0) {
            return false;
        }
        return true;
    }

    /**
     * 返回队列中的元素个数
     *
     * @return 队列中元素的个数
     */
    @Override
    int size() {
        return count;
    }

    void expand() {
        if (count == objects.length) {
            objects = Arrays.copyOf(objects, (objects.length + (objects.length >> 1)));
            //>>优先度不如+-
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueTest queueTest = (QueueTest) o;
        return count == queueTest.count && Arrays.equals(objects, queueTest.objects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(count);
        result = 31 * result + Arrays.hashCode(objects);
        return result;
    }

    @Override
    public String toString() {
        return "QueueTest{" +
                "count=" + count +
                ", objects=" + Arrays.toString(objects) +
                '}';
    }
}
