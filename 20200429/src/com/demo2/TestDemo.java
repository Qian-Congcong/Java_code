package com.demo2;

/**
 * program: 20200429
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-02 11
 * Time:23
 */
public class TestDemo {

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node newHead = new Node(0);
        Node tmp = newHead;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null){
            tmp.next = l2;
        }
        return newHead.next;
    }

    public static void creatCut(Node headA, Node headB) {
        headA.next = headB.next.next.next;
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        Node pl = headA;
        Node ps = headB;
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

        /*ListNode pl = headA;
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

        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while (ps != pl && pl != null && ps != null) {
            ps = ps.next;
            pl = pl.next;
        }
        if (pl == ps && pl != null) {
            return pl;
        }
        return null;*/
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(8);
        myLinkedList1.addLast(14);
        myLinkedList1.addLast(7);
        myLinkedList1.addLast(8);
        myLinkedList1.addLast(9);
        myLinkedList1.addLast(8);
        myLinkedList1.display();
        System.out.println();
        Node ret = myLinkedList1.removeElements(8);
        myLinkedList1.display2(ret);

        /*Node ret = myLinkedList1.deleteDuplication();
        myLinkedList1.display2(ret);
*/

        /*System.out.println();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(2);
        myLinkedList2.addLast(3);
        myLinkedList2.addLast(15);
        myLinkedList2.addLast(12);
        myLinkedList2.addLast(11);
        myLinkedList2.display();
        System.out.println();

        creatCut(myLinkedList1.head, myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList1.head, myLinkedList2.head);
        System.out.println(ret.data);*/


        //System.out.println("DDSS");



        /*System.out.println();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(3));
        System.out.println(myLinkedList.contains(5));
        myLinkedList.addIndex(2,5);
        myLinkedList.display();
        System.out.println();
        myLinkedList.addIndex(0,2);
        myLinkedList.addIndex(5,9);
        myLinkedList.display();
        System.out.println();
        myLinkedList.removeAllKey(4);
        myLinkedList.display();
        myLinkedList.clear();*/
    }
}
