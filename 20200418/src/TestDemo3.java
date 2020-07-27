/**
 * program: 20200418
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-18 21
 * Time:53
 */

class Personal {
    private String name;
    private int age;

    public static int count  = 0;

    static {
        //this.name = "zhangfei";  不能访问非静态的数据成员
        count=99;
        System.out.println("静态代码块........");
    }


    {
        /*this.name = "zhangfei";
        count=99;*/
        System.out.println("实例代码块.......");
    }

    public Personal() {
        //this("caocao",18);
        //this("zhangfei");只能调用一个
        System.out.println("Person<init>");
    }

    //alt+(f12)insert
    public Personal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }

    public static void func() {
        count=99;
        //this.name = "caocao";
    }


    public void eat() {
        System.out.println(this.getName());
        System.out.println(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo3 {

    public static void main(String[] args) {
        Personal person1 = new Personal();
        person1.eat();
        person1.eat();
        System.out.println(person1.getName());

        new Personal().eat();
        new Personal().getName();
    }

    public static void main2(String[] args) {
        System.out.println(Personal.count);
        /*Person person1 = new Person();
        System.out.println("==============");
        Person person2 = new Person();*/
    }
    public static void main1(String[] args) {
        Person person1 = new Person();
       /* System.out.println(person1);
        Person person2 = new Person("bit",19);
        System.out.println(person2);*/
    }
}

