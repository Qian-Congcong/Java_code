package com.demo4;

/**
 * program: 20200505
 * Created with IntelliJ IDEA.
 * Description:
 * 抽象类
 * User: YouName
 * Date:2020-05-05 21
 * Time:30
 */
abstract class Shape {
    abstract public void draw();

    void func() {
        System.out.println("func");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Shape shape = new Rect();
        shape.func();
    }
}
