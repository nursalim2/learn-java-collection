package com.nursalim.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Nursalim");
        names.push("Milasrun");
        names.push("Al");
        names.push("Losari");

        for (var name = names.pop(); !names.empty(); name = names.pop()) {
            System.out.println(name);
        }

    }
}
