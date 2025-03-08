package com.nursalim.collection;

import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nursalim", "Milasrun", "Al", "Losari");
        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});
    }
}
