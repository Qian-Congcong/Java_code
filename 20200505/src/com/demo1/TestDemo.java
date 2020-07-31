package com.demo1;

import java.util.*;
import java.sql.*;
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * program: 20200505
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-05 19
 * Time:43
 */



public class TestDemo {
    int value = 0;

    /**
     * 导入包
     */
    public static void main1(String[] args) {
        java.util.Date date = new java.util.Date();
        //得到一个毫秒级的时间戳
        // util 和 sql 中都存在一个 Date 这样的类, 此时用 Date date = new Date(); 就会出现歧义, 编译出错
        System.out.println(date.getTime());
    }

    /**
     * 静态导入
     * @param args
     */
    public static void main2(String[] args) {
        out.println("hello!");
    }

    public static void main3(String[] args) {
        double x = 20;
        double y = 30;
        //静态导入的方式写起来更方便一些
        //double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double result = sqrt(pow(x,2) + pow(y,2));
        out.println(result);
    }
}
