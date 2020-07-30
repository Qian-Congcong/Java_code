package com.demo1;

import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
import java.sql.*;
/**
 * program: 20200504
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-04 16
 * Time:24
 */
public class TestDemo2 {

    public static void Mian(String[] args) {
        TestDemo testDemo = new TestDemo();
        out.println(testDemo.value);
    }

    /**
     * 静态导入
     * @param args
     */
    public static void main3(String[] args) {
        double x = 30;
        double y = 40;
        //静态导入的方式写起来更方便一些
        //double result = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double result = sqrt(pow(x,2) + pow(y,2));
        out.println(result);
    }
    public static void main2(String[] args) {
        out.println("hello");
    }
    /**
     * 导入包
     * @param args
     */
    public static void main1(String[] args) {
        java.util.Date date = new java.util.Date();
        // util 和 sql 中都存在一个 Date 这样的类, 不加 java.uitl.Date 此时就会出现歧义, 编译出错
        System.out.println(date.getTime());
    }

}
