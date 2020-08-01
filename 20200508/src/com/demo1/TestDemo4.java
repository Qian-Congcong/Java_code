package com.demo1;

import java.util.Scanner;

/**
 * program: 20200508
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-10 15
 * Time:02
 */

public class TestDemo4 {
    public static char[] func(String str) {
        char[] tmp = str.toCharArray();
        char[] arr = new char[tmp.length+1];
        int x = 0;

        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] ret = func(str);
            for (char s: ret) {
                System.out.print(s + " ");
            }
        }
    }
}
