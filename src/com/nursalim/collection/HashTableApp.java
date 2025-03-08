package com.nursalim.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("firstName", "Nursalim");
        map.put("lastName", "Milasrun");

        for (var key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
