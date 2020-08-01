package com.demo1;

import java.util.*;

/**
 * program: 20200508
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-05-10 11
 * Time:15
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("太空飞机","宇航员");
        map.put("战斗机","飞行员");
        map.put("运输机","驾驶员");
        map.get("战斗机");
        map.getOrDefault("飞鹰战斗机","飞行员");
        System.out.println(map.containsKey("战斗机"));
        System.out.println(map.containsValue("驾驶员"));


    }

    public static void main1(String[] args) {
        Collection<Integer> collection = new LinkedList<>();
        collection.add(1);
        collection.add(6);
        collection.add(2);
        collection.add(4);
        collection.add(3);

        Object[] object = collection.toArray();
    }
}
