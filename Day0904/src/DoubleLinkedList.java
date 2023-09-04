import java.util.Objects;

/**
 * ClassName:DoubleLinkedLIst
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/9/20235:10 pm
 * @Version 1.0
 */
public class DoubleLinkedList {
    private static Node1 first;
    private static Node1 last;
    private static int size = 0;

    DoubleLinkedList() {
        first = null;
    }


    public static boolean add(Object node) {
        Node1 newNode1 = new Node1(null, null, node);
        if (node == null) return false;
        else if (first == null) {
            first = newNode1;
            last = newNode1;
        } else {
            last.next = newNode1;
            newNode1.next = first;
            newNode1.prev = last;
            last = newNode1;
            first.prev = last;
        }
        size++;
        return true;
    }

    public static boolean contains(Object node) {
        if (first == null || node == null) return false;
        else if (node == first.data) {
            return false;
        } else {
            Node1 temp = first.next;
            while (!Objects.equals(node, temp.data)) {
                if (temp == first) return false;
                temp = temp.next;
            }
        }
        return true;
    }

    /**
     * 正反都可以找对象
     *
     * @param index
     * @return
     */
    public static Node1 indexOf(int index) {
        Node1 temp = null;
        if (size == 0 || first == null) return temp;
        else if (index >= 0 && index < size) {
            temp = getObject(index);
        } else if (index < 0 && index > (-size)) {
            index = size + index;
            temp = getObject(index);
        }
        return temp;
    }


    /**
     * indexOf的专属二级方法
     * 负责求Node1对象
     *
     * @param index
     * @return
     */
    public static Node1 getObject(int index) {
        Node1 temp = first;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }


    public static boolean remove(Object node) {
        if (size == 0 || first == null || node == null) return false;
        else if (Objects.equals(node, first.data)) {
            first = first.next;
            first.prev = last;
            last.next = first;
        } else {
            Node1 temp = first.next;
            while (!Objects.equals(node, temp.data)) {
                temp = temp.next;
                if (temp == first) return false;
            }
        }
        size--;
        return true;
    }

    public static boolean isEmpty() {
        return !(size > 0);
    }


}


class Node1 {
    Node1 prev;
    Node1 next;
    Object data;

    public Node1() {
    }

    public Node1(Node1 prev, Node1 next, Object data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}