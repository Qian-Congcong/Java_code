package com.demo4;

/**
 * program: 20200505
 * Created with IntelliJ IDEA.
 * Description:
 * 接口
 * User: YouName
 * Date:2020-05-05 21
 * Time:36
 */
interface IShape {
    void draw();
    public static final int num = 10;
}

class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}

/*interface IMessage {
    public static final String str = "I am a boy";
    public abstract void print();
}*/

interface IMessage {
    String str = "I smart";
    void print();
}

/**
 * 实现多个接口
 */

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用爪子跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用腿蹬");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用爪子游");
    }
}

class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用爪子跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在水面上浮着");
    }
}
public class TestDemo2 {
    public static void main1(String[] args) {
        IShape shape = new Flower();
        shape.draw();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        walk(cat);
        Frog frog = new Frog("青蛙");
        walk(frog);
    }

    public static void walk(IRunning running) {
        System.out.println("我带着伙伴去散步");
        running.run();
    }
}
