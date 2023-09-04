import java.util.Objects;

/**
 * ClassName:ReLInked
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/9/202311:37 am
 * @Version 1.0
 */
public class ReLInked {
    Node node = new Node();
    private Node first;
    private int size = 0;//可以直接赋初始值，0就代表没有元素

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public boolean add(Object o) {
        if (o == null) return false;
        if (first == null) {
            first = new Node(o, null);//通过构造器直接创建对象进行赋值
        } else {
            Node temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node next = new Node(o, null);//创建下一位的对象
            temp.setNext(next);//将下一位对象链接到链表的末尾
        }
        //这里的setSize可以放在括号外边
        size++;
        return true;
    }

    public boolean contain(Object o) {
        if (o == null || size == 0 || first == null) return false;
        Node temp = first;
        while (temp != null && !(Objects.equals(temp.getValue(), o))
        ) {
            temp = temp.getNext();
        }
        return temp != null;
    }

    /**
     * 老版本delete方法，性能有点问题
     *
     * @param o
     * @return
     */
    public boolean delete(Object o) {
        if (size == 0 || o == null || !contain(o)) return false;
            //直接判断有没有在链表中，没有返回false,这么写会导致性能浪费，但是简单点
        else if (Objects.equals(o, first.getValue())) {
            first = first.getNext();
            return true;
            //这里必须要else条件，否则size--不执行
        } else {
            Node prev = first;
            while (prev != null && !(Objects.equals(prev.getNext(), o))) {
                prev = prev.getNext();
            }
            if (prev == null) return false;
            Node current = prev.getNext();
            Node nextEle = current.getNext();
            //为prev元素切换地址值
            prev.setNext(nextEle);
        }
        size--;
        return true;
    }

    public Object indexOf(int index) {
        Object temp = null;
        if (index < 0 || size == 0 || index >= size) {
            //这里的判断条件用于过滤不可选的，可以偷懒不在这里return
        } else {
            Node current = first;
            while (index > 0) {
                current = current.getNext();
                index--;
            }
            temp = current;
        }
        return temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linked[ ");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.getValue().toString());
            temp = temp.getNext();
            if (temp != null) sb.append(" , ");
        }
        sb.append(" ]");
        return sb.toString();
    }

    /**
     * 干掉全部元素
     */
    public void cleanUp() {
        first = null;
        size = 0;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Node {
    private Object Value;
    private Node next;

    public Node() {
    }

    public Node(Object value, Node next) {
        Value = value;
        this.next = next;
    }

    public Object getValue() {
        return Value;
    }

    public void setValue(Object value) {
        Value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
