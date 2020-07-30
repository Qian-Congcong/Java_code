package com.demo1;

import java.util.Date;

import static java.lang.System.out;

/**
 * program: 20200504
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-04 16
 * Time:11
 */
public class TestDemo {
    int value = 0;

    public static void main1(String[] args) {
        //java.util.Date date = new java.util.Date();
        Date date = new Date();
        //得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }

}
