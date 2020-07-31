package com.demo3;

/**
 * program: 20200505
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-05 20
 * Time:10
 */
class Animal {
    //public String name;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃 " + food);
    }

}

/*class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃 " + food);
    }
}*/

/*class Bird {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃 " + food);
    }

    public void fly() {
        System.out.println(this.name + "正在飞 ");
    }

}*/

class Cat extends Animal {
    public Cat(String name) {
        //使用super 调用父类的构造方法
        super(name);
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    /*public void eat(String food) {
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }*/

    @Override
    public void eat(String food) {
        //修改代码，让子类调用父类的接口
        super.eat(food);
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }

    public void fly() {
        //对于父类的 protected 字段，子类可以正确访问
        System.out.println(this.name + "正在飞 ");
    }

}

public class TestDemo {

    public static void main1(String[] args) {
        //对于类的调用者来说, protected 修饰的字段和方法是不能访问的
        //对于类的 子类 和 同一个包的其他类 来说, protected 修饰的字段和方法是可以访问的
        Animal animal = new Animal("小动物");
        System.out.println(animal.name);
        Cat cat = new Cat("圆圆");
        cat.eat("猫粮");
        Bird bird = new Bird("喳喳");
        bird.fly();
    }

    /**
     * 向上转型
     * @param args
     */
    public static void main2(String[] args) {
        //1、直接赋值
        /*Bird bird = new Bird("圆圆");
        Animal bird2 = bird;*/
        //或者写成下面的方式
        //Animal bird = new Bird("圆圆");

        //2、方法传参
        /*Bird bird = new Bird("圆圆");
        feed(bird);*/

        //3、方法返回
        Animal animal = findMyAnimal();

    }

    public static void feed(Animal animal) {
        animal.eat("谷子");
    }

    public static Animal findMyAnimal() {
        Bird bird = new Bird("圆圆");
        return bird;
    }

    /**
     * 运行时动态绑定
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal("圆圆");
        animal.eat("牛肉");
        Animal animal1 = new Bird("扁扁");
        animal1.eat("谷子");
    }
}
