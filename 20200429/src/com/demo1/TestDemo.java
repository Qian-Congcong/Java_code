package com.demo1;

import com.sun.javaws.IconUtil;

/**
 * program: 20200429
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-29 17
 * Time:26
 */
public class TestDemo {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.addLast(3);
        myDoubleLinkedList.addLast(4);
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.display();
        System.out.println();
        myDoubleLinkedList.removeAllKey(2);
        myDoubleLinkedList.display();
        myDoubleLinkedList.clear();



        //System.out.println();
        //System.out.println(myDoubleLinkedList.size());
        //myDoubleLinkedList.clear();

        //System.out.println("sfsf");
    }
}
