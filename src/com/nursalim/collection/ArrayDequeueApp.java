package com.nursalim.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);
        queue.offer("Nursalim");
        queue.offer("Milasrun");
        queue.offer("Al Losari");

        for (String next= queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Nursalim");
        priorityQueue.offer("Milasrun");
        priorityQueue.offer("Al Losari");

        for (String next= priorityQueue.poll(); next != null; next = priorityQueue.poll()) {
            System.out.println(next);
        }

        Queue<String> linkedList = new LinkedList<>();
        linkedList.offer("Nursalim");
        linkedList.offer("Milasrun");
        linkedList.offer("Al Losari");

        for (String next= linkedList.poll(); next != null; next = linkedList.poll()) {
            System.out.println(next);
        }
    }
}
