/**
 * program: 20200420
 * Created with IntelliJ IDEA.
 * Description:
 * 顺序表
 * User: YouName
 * Date:2020-04-22 09
 * Time:29
 */
public class TestDemo2 {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(5);
        for (int i = 0; i < 5; i++) {
            myArrayList.elem[i] = i;
        }
        myArrayList.display();
        /*myArrayList.add(0,10);
        myArrayList.add(2,18);*/

        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(3,15);
        myArrayList.display();
        myArrayList.remove(15);
        myArrayList.display();
        System.out.println(myArrayList.size());
    }
}
