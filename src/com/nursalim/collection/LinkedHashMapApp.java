package com.nursalim.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Nursalim", "Nursalim");
        map.put("Milasrun", "Milasrun");
        map.put("Al Losari", "Al Losari");

        for (var key: map.keySet()) {
            System.out.println(key);
        }

    }
}
