import java.security.spec.RSAOtherPrimeInfo;

/**
 * program: 20200416
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-19 10
 * Time:52
 */
class Personal {
    private String name;
    private int age;

    public static int count = 0;

    static {
        //this.name = "zhangfei";不能访问非静态的数据成员
        count = 99;
        System.out.println("静态代码块…………");
    }

    {
        this.name = "guanyu";
        count = 999;
        System.out.println("实例代码块…………");
    }

    public Personal() {
        //this("caocao",18);
        //this("zhangfei");
        System.out.println("Personal<init>");
    }

    public Personal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<String,int>");
    }

    public static void func() {
        count = 99;
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
        return "Personal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo4 {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.eat();
        personal.eat();
        System.out.println(personal.getName());
        new Personal().eat();
        new Personal().getName();
    }

    public static void main2(String[] args) {
        System.out.println(Personal.count);
        Personal personal = new Personal();
        System.out.println("===========");
        Personal personal1 = new Personal();
    }

    public static void main1(String[] args) {
        Personal personal = new Personal();
        System.out.println(personal);
        Personal personal1 = new Personal();
        System.out.println(personal1);
    }
}
