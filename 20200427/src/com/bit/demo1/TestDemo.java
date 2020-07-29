package com.bit.demo1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * program: 20200427
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-28 14
 * Time:14
 */

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal");
    }

    public void eat() {
        System.out.println(this.name + "Animal :: eat()");
    }

    public void sleep() {
        System.out.println("Animal :: sleep()");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Bird::fly()");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("xiaoli");
        Cat cat = new Cat("mimi");
        cat.name = "mimi";
        cat.eat();
    }
}
