/**
 * program: 20200427
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-28 17
 * Time:07
 */
public class TestDemo {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addLast(1);
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.addLast(3);
        myDoubleLinkedList.addLast(4);
        myDoubleLinkedList.addLast(5);
        myDoubleLinkedList.display();
        myDoubleLinkedList.clear();
    }
}
