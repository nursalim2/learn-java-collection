package com.nursalim.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("Nursalim", "Nursalim");
        navigableMap.put("Milasrun", "Milasrun");
        navigableMap.put("Al", "Al");
        navigableMap.put("Losari", "Losari");

        System.out.println(navigableMap.lowerKey("Milasrun"));
        System.out.println(navigableMap.higherKey("Losari"));

        NavigableMap<String, String> descending = navigableMap.descendingMap();
        System.out.println(descending);

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(navigableMap);

    }
}
