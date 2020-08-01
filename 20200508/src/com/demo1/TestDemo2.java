package com.demo1;

/**
 * program: 20200508
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-08 16
 * Time:00
 */
public class TestDemo2 {
    public static String fistUpper(String str) {
        if("".equals(str) || str == null) {
            return str;
        }
        if (str.length() > 1) {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "  Hello  World  ";
        System.out.println("[" + str + "]");
        System.out.println("[" + str.trim() + "]");

        String str1 = "     Hello%%$$@$#^&^# World 哈哈 ";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println("Hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());
        System.out.println(str1.isEmpty());

        System.out.println(fistUpper("yuisamam"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));
    }

    //截取
    public static void main5(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(5));
        System.out.println(str.substring(3,7));
    }

    //拆分
    public static void main4(String[] args) {
        String str = "Hello World Hello boy!";
        String[] result = str.split("o");
        for (String s:result) {
            System.out.print(s);
        }
        System.out.println();
        String[] result1 = str.split(" ",7);
        for (String s:result1) {
            System.out.println(s);
        }
        String str1 = "192.168.1.1";
        String[] result2 = str1.split("\\.");
        for (String s: result2) {
            System.out.println(s);
        }

        String str2 = "name= zhangsan &age*=18";
        String[] result3 = str2.split("\\*");
        for (int i = 0; i < result3.length; i++) {
            String[] temp = result3[i].split("=");
            System.out.println(temp[0] + " = " + temp[1]);
        }
    }

    //替换
    public static void main3(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.replaceAll("l","_"));
        System.out.println(str.replaceFirst("l","+"));
    }

    //字符串查找
    public static void main2(String[] args) {
        String str = "HelloWorld!";
        System.out.println(str.contains("World"));

        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("has"));
        if (str.indexOf("Hello") != -1) {
            System.out.println("可以查找到指定字符串！");
        }
        System.out.println(str.indexOf("owo",6));
        System.out.println(str.lastIndexOf("l"));//8
        System.out.println(str.lastIndexOf("l",6));

        String str1 = "**@@HelloWorld!!";
        System.out.println(str1.startsWith("**"));//true
        System.out.println(str1.startsWith("!!",14));//true
        System.out.println(str1.endsWith("!!"));//true
    }

    //字符串比较
    public static void main1(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println("A".compareTo("a"));//-32
        System.out.println("a".compareTo("A"));//32
        System.out.println("A".compareTo("A"));//0
        System.out.println("AB".compareTo("AC"));//-1
        System.out.println("刘".compareTo("杨"));
    }
}
