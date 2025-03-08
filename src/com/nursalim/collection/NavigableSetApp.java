package com.nursalim.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Nursalim", "Milasru", "Al", "Losari"));

        NavigableSet<String> nameDesc = names.descendingSet();
        NavigableSet<String> Nursalim = names.headSet("Nursalim", true);

        for (var name: names) {
            System.out.println(name);
        }

        // immutable navigable set
        NavigableSet<String> emptyNavigableSet = Collections.emptyNavigableSet();
        NavigableSet<String> immutableNavigableSet = Collections.unmodifiableNavigableSet(names);

    }
}
