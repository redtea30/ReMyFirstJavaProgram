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

    public boolean contains(Object o) {
        if (size() == 0 && o == null) return false;
        Node temp = first;
        while (Objects.equals(o, temp)) {
            //必须放在上面，执行顺序
            if (temp.getNext() == null) return false;
            temp = temp.getNext();
        }
        return true;
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
            size++;
            return true;
        }
        return true;
    }

    public boolean contain(Object o) {
        if (o == null || size == 0) return false;
        Node temp = first;
        while (temp.getValue() != o && temp != null) {
            temp = temp.getNext();
        }
        return temp != null;
    }

    public boolean delete(Object o) {
        if (size == 0 || o == null || !contain(o)) return false;
        //直接判断有没有在链表中，没有返回false,这么写会导致性能浪费，但是简单点
        if (first.getValue() == o) first = first.getNext();
        Node prev = first;
        while (!(Objects.equals(prev.getNext().getValue(), o))) {
            prev = prev.getNext();
        }

        Node current = prev.getNext();
        Node nextEle = current.getNext();
        //为prev元素切换地址值
        prev.setNext(nextEle);
        size--;
        return true;
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
