package com.nursalim.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Nursalim", "Milasrun", "Al Losari");
        for (String name : names) {
            System.out.println(name);
        }

        // Manual using iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }
}
