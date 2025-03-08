package com.nursalim.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Nursalim");
        names.add("Milasrun");
        names.add("Al Losari");
        names.add("Nursalim");

        for (var name : names) {
            System.out.println(name);
        }

        Set<String> namesOrdered = new LinkedHashSet<>();
        namesOrdered.add("Nursalim");
        namesOrdered.add("Milasrun");
        namesOrdered.add("Al Losari");
        namesOrdered.add("Nursalim");

        for (var name : namesOrdered) {
            System.out.println(name);
        }
    }
}
