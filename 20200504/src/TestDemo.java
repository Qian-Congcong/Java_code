import static java.lang.System.out;

/**
 * program: 20200504
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-04 16
 * Time:52
 */
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class TestDemo {
    public ListNode head;

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null && fast.next == null) {
            return false;
        }
        return true;
    }

    /**
     * 删除中间节点
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 返回倒数第 k 个节点
     * @param k
     * @return
     */
    public int kthToLast(int k) {
        if(this.head == null) {
            throw new RuntimeException("空链表！");
        }
        if (k <= 0) {
            throw new RuntimeException("k位置不合法！");
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k > 0) {
            if (fast == null) {
                throw new RuntimeException("k位置不合法！");
            }
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    /**
     * 二进制链表转整数
     */
    public int getDecimalValue() {
        ListNode cur = this.head;
        int ans = 0;
        while (cur != null) {
            /*ans = ans * 2 + cur.val;
            cur = cur.next;*/
            ans <<= 1;
            ans += cur.val;
            cur = cur.next;
        }
        return ans;
    }

    public ListNode deleteDuplicates() {
        if (this.head == null) {
            return null;
        }
        ListNode prev = this.head;
        ListNode cur = prev.next;
        while (cur != null) {
            if (prev.val == cur.val) {
                prev.next = cur .next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        return this.head;
    }

    /**
     * 删除链表的倒数第N个节点
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(int n) {
        if (this.head == null) {
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode fast = this.head;
        ListNode slow = this.head;
        ListNode prev = newHead;
        prev.next = slow;
        if (n <= 0) {
            return null;
        }
        while (n > 0) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            prev = prev.next;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        return newHead.next;
    }

    /**
     * 删除链表的节点
     * @param val
     * @return
     */
    public ListNode deleteNode(int val) {
        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        ListNode cur = this.head;
        prev.next = cur;
        while (cur != null) {
            if (cur.val == val) {
                break;
            }
            prev = prev.next;
            cur = cur.next;
        }
        if (cur == null) {
            return null;
        }
        prev.next = cur.next;
        return newHead.next;
    }

    /**
     * 反转链表
     * @return
     */
    public ListNode reverseList() {
        ListNode cur = this.head;
        ListNode curNext = null;
        ListNode newHead = null;
        ListNode prev = null;
        while (cur != null) {
            curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    /**
     * 移除重复节点
     * @return
     */
    public ListNode removeDuplicateNodes() {
        ListNode newHead = new ListNode(0);
        ListNode cur = this.head;
        ListNode prev = newHead;
        return null;
    }
}
