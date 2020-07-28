/**
 * program: 20200423
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-23 12
 * Time:19
 */


public class MyLinkedList {

    public ListNode head;
    public ListNode removeElementsTwo(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode cur = head;
        while (cur != null) {
            if (cur.data == val) {
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }
        return sentinel.next;
    }

    //删除所有值为 val 的节点
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            throw new RuntimeException("链表为空！");
        }
        this.head = head;
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            if (cur.data == val) {
                count++;
            }
            cur = cur.next;
        }
        if(count == 0) {
            throw new RuntimeException("不存在与val相同的值！");
        }
        ListNode node = new ListNode(0);
        while (count != 0) {
            node = remove(val);
            count--;
        }
        return node;
    }

    //删除第一个 val 值的节点
    public ListNode remove(int val) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == val) {
                break;
            }
            cur = cur.next;
        }
        ListNode node = this.head;
        while (node.next != null) {
            if (cur == node.next) {
                break;
            }
            node = node.next;
        }
        node.next = cur.next;
        return node;
    }

    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void display() {
        ListNode node = this.head;
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
        System.out.println();
    }
}
