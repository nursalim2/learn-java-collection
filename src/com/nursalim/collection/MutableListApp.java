package com.nursalim.collection;

import com.nursalim.collection.data.Person;

import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {
        Person nursalim = new Person("Nursalim");
        nursalim.addHobby("Game");
        nursalim.addHobby("Coding");

        doSomethingWithHobbis(nursalim.getHobbies());

        for (var hobby : nursalim.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbis(List<String> hobbies){
        hobbies.add("Not hobby");
    }
}
