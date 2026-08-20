package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Sushma", 34));
        people.add(new Person("Akash", 25));
        people.add(new Person("Hema", 17));

        people.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("Sorted by name\n");

        for (Person p : people) {
            p.display();
        }
    }
}