package com.demo1;

/**
 * program: 20200429
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-29 17
 * Time:26
 */

class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyDoubleLinkedList {

    public Node head;
    public Node tail;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }
    private void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法！");
        }
    }

    private Node searchIndex(int index) {
        Node cur = this.head;
        while (index != 0) {
            //if (index )
            index--;
        }
        return null;
    }
    // 任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        checkIndex(index);
        if (this.head == null) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
    }
    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    // 删除第一次出现关键字为key的节点
    public int remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }

        return -1;
    }
    // 删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data +" ");
            cur = cur.next;
        }
    }
    public void clear() {
        /*this.head = null;
        this.tail = null;*/

        while (this.head != null) {
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.tail = null;
    }

}
