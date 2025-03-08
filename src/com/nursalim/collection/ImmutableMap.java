package com.nursalim.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("serial", "123231");
        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Nursalim");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> names = Map.of("firstName", "Nursalim",
                "middleName", "Milasrun",
                "lastName", "Al Losari");

    }
}
