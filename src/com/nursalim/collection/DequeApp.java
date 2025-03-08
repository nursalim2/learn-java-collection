package com.nursalim.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Nursalim");
        stack.offerLast("Milasrun");
        stack.offerLast("Al Losari");

        for (var item = stack.pollLast(); item != null; item = stack.pollLast()) {
            System.out.println(item);
        }

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Nursalim");
        queue.offerLast("Milasrun");
        queue.offerLast("Al Losari");

        for (var item = queue.pollFirst(); item != null; item = queue.pollFirst()) {
            System.out.println(item);
        }
    }
}
