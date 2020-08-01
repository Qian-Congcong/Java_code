package com.demo1;

import java.util.*;

/**
 * program: 20200510
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-10 21
 * Time:56
 */
public class TestDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者", "佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        map.put("作者", "鲁迅");
        map.put("标题", "狂人日记");
        map.put("发表时间", "1918年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者", "佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        for (Map.Entry<String, String> entry :map.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }

    public static void main6(String[] args) {
        Collection<String> sb = new LinkedList<>();
        System.out.println(sb.size());
        System.out.println(sb.isEmpty());
        sb.add("Hello");
        sb.add("World");
        sb.add("hello");
        sb.add("a");
        System.out.println(sb.size());
        System.out.println(sb.isEmpty());
        Object[] arr = sb.toArray();
        System.out.println(Arrays.toString(arr));
        for (Object s: sb) {
            System.out.println(s);
        }
        sb.remove("hello");
        for (Object s:sb) {
            System.out.println(s);
        }
        sb.clear();
        System.out.println(sb.size());
        System.out.println(sb.isEmpty());
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String str2 = scan.nextLine();
            System.out.println(str.compareTo(str2));
        }
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String str2 = scan.nextLine();
            System.out.println(str.contains(str2));
        }
    }

    public static void main3(String[] args) {
        String str = "Hello World hello boy!";
        System.out.println(str.indexOf("ll",0));
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String str3 = scan.nextLine();
            String str4 = scan.nextLine();
            String str2 = str.replaceAll(str3,str4);
            System.out.println(str2);
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String str2 = scanner.nextLine();
            //String str = "Hello World hello boy!";
            String[] arr = str.split(str2,3);
            for (String s:arr) {
                System.out.println(s);
            }
        }

    }
}
