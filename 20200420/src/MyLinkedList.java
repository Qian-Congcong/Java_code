/**
 * program: 20200420
 * Created with IntelliJ IDEA.
 * Description:
 *
 * User: YouName
 * Date:2020-04-22 08
 * Time:52
 */
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) { //节点
        this.data = data;
        //this.next = null;
    }
}

public class MyLinkedList {

    public Node head; //保存单链表的头节点的引用 null

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    private Node searchIndex(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index输入不合法！");
        }
        Node cur = this.head;
        while ((index - 1) != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中
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

    private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("没有这个节点！");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;

        /*int index = 0;
        Node cur = this.head;
        if (this.head.data == key) {
            cur = cur.next;
            this.head = cur;
            return;
        }
        if (contains(key) && key != head.data) {
            while (cur.data != key && cur != null) {
                cur = cur.next;
                index++;
            }
            Node node = this.head;
            while (index - 1 != 0) {
                node = node.next;
                index--;
            }
            node.next = cur.next;
        }else {
            throw new RuntimeException("key不合法！");
        }*/
    }
     //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }

        /*Node cur = this.head;
        int index = 0;
        while (cur != null) {
            if (cur.data == key) {
                index++;
            }
            cur = cur.next;
        }
        while (index != 0) {
            remove(key);
            index--;
        }*/

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
        System.out.println();
    }
    public void clear() {
        this.head = null;
    }

    //反转链表
    public Node reverseList() {
        Node cur = this.head;
        Node newHead = null;
        Node prev = null;

        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node niddleNode() {
        if (this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 链表中倒数第 K 个数
     * @param k
     * @return
     */
    /*public Node FindKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if (k < 0) {
            System.out.println("k不合法！");
            return null;
        }
        while (fast != null) {
            if (k-1 > 0 || fast != null) {
                fast =fast.next;
                k--;
            }
        }
        while (fast != null) {
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

    }*/

    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
        if (bs == null) {
            return as;
        }
        //2、如果bs不为空  需要进行拼接
        be.next = as;

        //3、如果ae不为空    ae的next需要置为空
        if (ae != null) {
            ae.next = null;
        }
        return bs;
    }

    public Node deleteDuplication() {
        Node newHead = new Node(0);
        Node cur = this.head;
        Node tmp = newHead;

        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


}
