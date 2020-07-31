package com.demo3;

/**
 * program: 20200505
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-05 20
 * Time:21
 */
class Shape {//形状
    public void draw() {//画

    }
}

class Cycle extends Shape {//旋转、周期
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}

class Triangle extends Shape {//三角形
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class TestDemo2 {

    /**
     * 多态
     * @param args
     */
    public static void main1(String[] args) {
        Shape shape = new Cycle();
        Shape shape1 = new Rect();
        Shape shape2 = new Flower();
        drawShape(shape);
        drawShape(shape1);
        drawShape(shape2);
        System.out.println();
        drawShapes();
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }

    // 我们创建了一个 Shape 对象的数组.
    public static void drawShapes() {
        Shape[] shape = {
                new Cycle(),
                new Rect(),
                new Cycle(),
                new Rect(),
                new Flower(),
        };
        for (Shape x: shape) {
            x.draw();
        }
    }

    /**
     * 向下转型
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Cat("小猫");
        if (animal instanceof Bird) {
            //instanceof 可以判定一个引用是否是某个类的实例.
            // 如果是, 则返回 true. 这时再进行向下转型就比较安全了
            Bird bird = (Bird)animal;
            bird.fly();
        }
    }

}
