/**
 * program: 20200423
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-23 11
 * Time:12
 */
public class TestDemo2 {

    public static void main(String[] args) {
        /*MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,6);
        myArrayList.add(3,3);
        myArrayList.add(4,4);
        myArrayList.add(5,5);
        myArrayList.add(6,6);
        myArrayList.display();

        myArrayList.removeArray(6);
        myArrayList.display();*/

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(6);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.display();
        myLinkedList.removeElements(myLinkedList.head, 6);
        myLinkedList.display();
    }
}
