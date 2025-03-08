package com.nursalim.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> names = new LinkedList<>();


        names.add("Nursalim");
        names.add("Milasrun");
        names.add("Al Losari");

        System.out.println(names.get(0));

        names.set(0, "Alfarizi");
        System.out.println(names.get(0));
        System.out.println(names.get(1));

    }
}
