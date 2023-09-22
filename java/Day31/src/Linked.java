/**
 * ClassName:List
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/8/20238:01 pm
 * @Version 1.0
 */

import java.util.Objects;

public class Linked {
    private Node first;
    private int size;


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

    /**
     * 获取链表的长度
     *这就是自动计算
     * @return
     */
    public int size() {
        size = 0;
        Node t = first;
        if (t == null) return 0;
        while (t != null) {
            t = t.next;
            this.setSize(this.getSize()+1);
        }
        return this.getSize();
    }

    /**
     * 返回链表是否是空的
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0 && first == null;
    }

    /**
     * 返回链表是否包含某个对象
     *
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        if (size == 0) return false;
        Node t = first;
        while (!t.equals(o)) {
            t = t.next;
            if (t == null) return false;
        }
        return true;
    }

    /**
     * 添加元素到链表中
     *
     * @param o
     * @return
     */
    public boolean add(Object o) {
// Object --> 放到Node对象里面去
        Node node = new Node(o, null);
        if (first == null) {
            first = node;
            return true;
        }
        Node t = first;
        System.out.println(t.next);
        while (t.next != null) {
            t = t.next;
        }
        t.next = node;
        return true;
    }

    /**
     * 删除某个元素
     *
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        if (first == null || !contains(o)) return false;
        Node temp = first;
        if (o == first) {
            first = first.next;
        } else {
            //直接定位到o的上一位
            while (temp.next != o) {
                temp = temp.next;
            }
            Node current = temp.next;
            Node nextNode = current.next;
            //没指针指向它了，等gc清理
            temp.next = nextNode;
        }
        return true;

    }

    /**
     * 获取指定位置的元素
     *
     * @param index
     * @return
     */
    public Object get(int index) {
        if (first == null || index < 0 || index > size()) return null;
        Node temp = first;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }

    /**
     * 返回指定元素的下标
     *
     * @param o
     * @return
     */
    public int indexOf(Object o) {
        if (!contains(o)) return -1;
        int index = 0;
        Node temp = first;
        while (!(o.equals(temp))) index++;
        return index;
    }

    /**
     * 将链表转换成字符串 Linked[元素, 元素, ...]
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linked[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.value);
            if (temp.next != null) sb.append(",");
            temp = temp.next;
        }

        sb.append("]");
        return sb.toString();
    }

    /**
     * Inner class
     */
    class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return Objects.equals(value, node.value) && Objects.equals(next,
                    node.next);
        }


    }
}