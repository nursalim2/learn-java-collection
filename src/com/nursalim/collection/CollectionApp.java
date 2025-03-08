package com.nursalim.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // ADDING new list
        names.add("Nursalim");
        names.add("Milasrun");
        names.add("Al Losari");
        names.addAll(List.of("Ana", "Fauziyah", "Naura"));
        for (var name: names) {
            System.out.println(name);
        }

        // REMOVE element
        names.remove("Nursalim");
        names.removeAll(List.of("Ana", "Naura"));

        for (var name: names) {
            System.out.println(name);
        }

        // Searching
        System.out.println(names.contains("Nursalim"));
        System.out.println(names.containsAll(List.of("Milasrun", "Al Losari")));
    }
}
