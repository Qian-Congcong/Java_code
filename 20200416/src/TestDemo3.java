/**
 * program: 20200416
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-19 10
 * Time:14
 */

class Student {
    private String name;
    private int age;
    private String MyName;

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

    /*//提供一个公开的接口
    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;//其实就是 自己给自己赋值  并没有赋值属性  局部变量优先
    }*/

    private void func1() {
        System.out.println("func1()");
    }

    public void show() {
        System.out.println("我叫" + this.name + ", 今年" + this.age + "岁");
    }

    //重新 实现了一下 Object类的 toString()方法
    //Object  是 所有类的父类  alt + insert  ->toString()
    @Override//注解：这个注解指的是  这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码

//以下是类的调用者
public class TestDemo3 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("caocao");
        String str = student.getName();
        System.out.println(str);
        student.show();
        System.out.println(student);

        String str2 = student.toString();
        System.out.println(str2);
    }
}
