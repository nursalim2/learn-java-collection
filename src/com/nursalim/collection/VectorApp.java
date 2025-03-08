package com.nursalim.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> names = new Vector<>();
        names.add("Nursalim");
        names.add("Milasrun");
        names.add("Al");
        names.add("Losari");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
