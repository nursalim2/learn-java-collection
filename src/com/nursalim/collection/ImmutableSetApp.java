package com.nursalim.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> emptySet = Collections.emptySet();
        Set<String> oneSet = Collections.singleton("Nursalim");

        Set<String> names = new HashSet<>();
        names.add("Nursalim");
        names.add("Milasrun");
        names.add("Al Losari");

        Set<String> immutableSet = Collections.unmodifiableSet(names);

        Set<String> fruits = Set.of("Mango", "Aple", "Banana");
    }
}
