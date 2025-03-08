package com.nursalim.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SplitIteratorApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nursalim", "Milasrun", "Al", "Losari", "Ana", "Fauziah");
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
