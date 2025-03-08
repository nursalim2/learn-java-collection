package com.nursalim.collection;

import com.nursalim.collection.data.Person;
import com.nursalim.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person("Nursalim"));
        persons.add(new Person("Al"));
        persons.add(new Person("Losari"));

        for (var person : persons) {
            System.out.println(person.getName());
        }

        // immutable sorted set
        SortedSet<Person> immutableSortedSet = Collections.unmodifiableSortedSet(persons);
        SortedSet<Person> emptySortedSet = Collections.emptySortedSet();


    }
}
