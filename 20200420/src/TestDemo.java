/**
 * program: 20200420
 * Created with IntelliJ IDEA.
 * Description:
 * 单链表
 * User: YouName
 * Date:2020-04-22 08
 * Time:49
 */
public class TestDemo {

    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(0);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA == null) {
            tmp.next = headB;
        }else {
            tmp.next = headA;
        }
        return newHead.next;
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
        return null;
    }

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(5);
        myLinkedList.addLast(14);
        myLinkedList.addLast(2);
        myLinkedList.addLast(8);
        myLinkedList.addLast(11);

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(5);
        myLinkedList.addLast(14);
        myLinkedList.addLast(2);
        myLinkedList.addLast(8);
        myLinkedList.addLast(11);

        Node node = getIntersectionNode(myLinkedList.head,myLinkedList1.head);
    }
}
