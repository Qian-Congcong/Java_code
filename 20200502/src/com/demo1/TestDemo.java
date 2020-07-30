package com.demo1;

import java.util.List;

/**
 * program: 20200502
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-02 11
 * Time:11
 */

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
 }
public class TestDemo {
    public ListNode head;

    public ListNode removeDuplicateNodes() {
        if (this.head == null || this.head.next == null) {
            return this.head;
        }
        ListNode cur = this.head;
        ListNode curNext = this.head;
        ListNode prev = null;
        while (cur != null) {
            curNext = cur.next;
            prev = cur;
            while (curNext != null) {
                if (cur.val == curNext.val) {
                    prev.next = curNext.next;
                }else {
                    prev = curNext;
                }
                curNext = curNext.next;
            }
            cur = cur.next;
        }
        return this.head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        while (len != 0) {
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

    public static void main(String[] args) {
        
    }
}
