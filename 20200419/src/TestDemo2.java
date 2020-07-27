/**
 * program: 20200419
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-19 20
 * Time:31
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i,i);
        }
        myArrayList.display();
        myArrayList.add(10,112);
        myArrayList.display();
        myArrayList.remove(4);
        myArrayList.display();
        System.out.println("clear()");
        myArrayList.clear();
        myArrayList.display();
    }
}
