package com.nursalim.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.PREMIUM, "Bayar");

        for (var key : map.entrySet()) {
            System.out.println(key.getKey().name() + " - " + key.getValue());

        }

        System.out.println(map.get(Level.PREMIUM));
        System.out.println(map.get(Level.FREE));
    }
}
