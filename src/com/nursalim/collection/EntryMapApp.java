package com.nursalim.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Nursalim", "Nursalim");
        map.put("Milasrun", "Milasrun");
        map.put("Al", "Al");
        map.put("Losari", "Losari");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
