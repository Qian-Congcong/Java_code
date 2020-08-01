package com.demo1;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * program: 20200508
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-08 13
 * Time:53
 */
public class TestDemo {

    //字节与字符串
    public static void main6(String[] args) throws UnsupportedEncodingException {
        String str = "HelloWorld!";
        //String 转换  byte[]
        byte[] data = str.getBytes();
        for (byte x:data) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        //byte[] 转换  String
        System.out.println(new String(data));
        System.out.println(new String(data,1,6));
        String str1 = "李晓媛";
        byte[] bytes = str1.getBytes("utf8");
        System.out.println(Arrays.toString(bytes));
    }
    //字符与字符串
    public static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if(data[i] < '0' || data[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main5(String[] args) {
        String str = "1asef45";
        System.out.println(isNumber(str) ? "字符串由数字组成！" : "字符串有非数字成员！");
    }

    public static void main4(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(1));

        String str1 = "HelloWorld";
        //将字符串变为字符数组
        char[] data = str1.toCharArray();
        for (char x:data) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println(new String(data));//全部转换成字符串
        System.out.println(new String(data, 0, 5));//部分转换成字符串
    }

    public static void main3(String[] args) throws NoSuchFieldException, IllegalAccessException{
        String str1 = new String("Hello");
        String str2 = "Hello";
        System.out.println(str1 == str2);//false

        String str3 = new String("Hello").intern();
        String str4 = "Hello";
        System.out.println(str3 == str4);//true
        //修改字符串
        String str5 = "Hello";
        str5 = "r" + str5.substring(1);
        System.out.println(str5);

        String str6 = "Hello";
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[]) valueField.get(str6);
        value[0] = 'h';
        System.out.println(str6);
}

    public static void main2(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println(x == y);//true

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);//true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4);//false

        String str5 = new String("Hello");
        String str6 = new String("Hello");
        System.out.println(str6.equals(str5));//true
        //System.out.println(str5.equals(str6)); 这样写也行

        String str7 = new String("Hello");
        System.out.println(str7.equals("Hello"));//true
        System.out.println("Hello".equals(str7));

        String str8 = null;
        System.out.println("Hello".equals(str8));//false
    }

    public static void main1(String[] args) {
        String str = "Hello boy";
        System.out.println(str);
        String str2 = new String("Hello!");
        System.out.println(str2);
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        System.out.println(str3);
    }
}
