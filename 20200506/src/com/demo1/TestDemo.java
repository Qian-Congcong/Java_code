package com.demo1;

/**
 * program: 20200506
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-06 16
 * Time:38
 */
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}
public class TestDemo {
    public ListNode head;
    /**
     * 链表回文
     * @return
     */
    public boolean isPalindrome() {
        if (this.head == null) {
            return false;
        }
        if (this.head.next == null) {
            return true;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (this.head != slow) {
            if (this.head.val != slow.val) {
                return false;
            }
            if (this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }

    /**
     * 两个链表相交的节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        while (pl != null) {
            pl = pl.next;
            lenA++;
        }
        while (ps != null) {
            ps = ps.next;
            lenB++;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        while (len > 0) {
            pl = pl.next;
            len--;
        }
        while (pl != null && ps != null) {
            if (pl == ps) {
                return ps;
            }
            pl = pl.next;
            ps = ps.next;
        }
        return null;
    }
}
