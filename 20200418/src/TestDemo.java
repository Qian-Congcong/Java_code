/**
 * program: 20200418
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-18 17
 * Time:16
 */

class Person{
    private String name;//实例成员变量
    private int age;
    private String sex;
    private static int count = 0;//静态成员变量 由类共享数据 方法区

    public Person(){
        System.out.println("I am Person init()!");
    }

    //实例代码块
    {
        this.name = "bit";
        this.age = 12;
        this.sex = "man";
        System.out.println("I am instance init()!");
    }

    //静态代码块
    static {
        count = 10;//只能访问静态数据成员
        System.out.println("I am static init()!");
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}

/**
 * 编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
 * 不能在定义的同时初始化，最后实现加减乘除四种运算.
 */
class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void add() {
        int sum = num1 + num2;
        System.out.println(num1 +"+"+ num2 +"="+sum);
    }
    public void sub() {
        int subt = num1 - num2;
        System.out.println(num1 +"-"+ num2 +"="+subt);
    }
    public void multip() {
        int mul = num1 * num2;
        System.out.println(num1 +"*"+ num2 +"="+mul);
    }
    public void divi() {
        double div = (double)num1 / num2;
        System.out.println(num1 +"/"+ num2 +"="+div);
    }
}

/**
 * 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象
 */
class Student {
    private String name;
    private int age;
    private String sex;
    //默认构造函数
    public Student() {
        this("bit",12,"man");
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show() {
        System.out.println("name: "+ name +" age: "+ age +" sex: "+sex);
    }
}

/**
 * 实现交换两个变量的值。要求：需要交换实参的值
 */
class Exchange {
    private int num1;
    private int num2;

    public Exchange(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        /*int tmp = num1;
        this.num1 = num2;
        this.num2 = tmp;
        System.out.println("互换");*/
    }

    public void swap() {
        int temp=this.num1;
        this. num1=this.num2;
        this.num2= temp;
        System.out.println("互换");
    }

    public void show() {
        System.out.println("num1 = "+ num1 +" mun2 ="+ num2);
    }
}

public class TestDemo {



    public static void main4(String[] args) {
        Exchange exchange = new Exchange(12,10);
        exchange.swap();
        exchange.show();
    }

    public static void main3(String[] args) {
        Student student = new Student();
        student.show();
        Student student1 = new Student("diaocan","nv");
        student1.show();
        Student student2 = new Student("caocao",64,"man");
        student2.show();
    }

    public static void main2(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(12);
        calculator.setNum2(14);
        //int num1 = calculator.getNum1();
        //int num2 = calculator.getNum2();
        //System.out.println(num1);
        //System.out.println(num2);
        calculator.add();
        calculator.sub();
        calculator.multip();
        calculator.divi();
    }

    public static void main1(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();//静态代码块是否还会被执行？
    }
}
