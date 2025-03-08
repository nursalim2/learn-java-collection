package com.nursalim.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {

    static Comparator<String> descending = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };

    public static void main(String[] args) {
//        SortedMap<String, String> sortedMap = new TreeMap<>();
        SortedMap<String, String> sortedMap = new TreeMap<>(descending);
        sortedMap.put("second", "Nursalim");
        sortedMap.put("third", "Al Losari");
        sortedMap.put("first", "Milasrun");

        for (var entry : sortedMap.entrySet()) {
            System.out.println(entry);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
    }
}
