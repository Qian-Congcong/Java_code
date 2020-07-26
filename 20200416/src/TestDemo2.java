/**
 * program: 20200416
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-19 09
 * Time:31
 */
class Person {
    public int age = 18;
    public String name = "caocao";
    public String sex;
    public static int size;
    public void eat() {
        System.out.println("吃饭！");
    }

    public void sleep() {
        int b = 10;
        System.out.println("睡觉！");
    }
    public static void func1() {
        System.out.println("static::func1()");
        //age = 99; error   静态方法内部  不能够访问非静态的数据成员
        size = 9999;
    }

    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}

class Test {
    public int a ;
    public static int count;
}


public class TestDemo2 {

    public static void main(String[] args) {

    }

    public static void func() {

    }
    public void func2() {

    }

    public static void main6(String[] args) {
        func();
        TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.func2();
    }

    public static void main5(String[] args) {
        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);//1
        System.out.println(Test.count);//1
        System.out.println("============");
        Test t2 = new Test();
        t2.a++;//1
        Test.count++;//2
        System.out.println(t2.a);
        System.out.println(Test.count);
    }

    public static void main4(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "李四";
        person.age = 20;
        person.show();
        person.eat();
        Person.func1();
        System.out.println(Person.size);
    }

    public static void main3(String[] args) {
        //如何访问静态的数据成员    类名.静态成员变量
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(Person.size);
    }

    public static void main2(String[] args) {
        Person per = new Person();
        //如何访问对象当中的实例成员变量？
        //操作符：点号  对象的引用 . 成员变量
        System.out.println(per.name);
        per.name = "bit";
        System.out.println(per.name);
        System.out.println(per.age);
    }

    public static void main1(String[] args) {
        //实例化一个对象 通过关键字 new
        Person person = new Person();
        Person person1 = new Person();
    }
}
