package com.functionalProgramming;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.functionalProgramming.Main.Gender.*;
import static com.functionalProgramming.Main.Person;

public class Main {


    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(List.of(
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Max", MALE),
                new Person("Aisha", FEMALE),
                new Person("Ali", MALE),
                new Person("Gina", FEMALE)
        ));

        List<Person> female = new ArrayList<>();
        for (Person people : person) {
            if (FEMALE.equals(people.gender))
                female.add(people);
        }

        for (Person person1 : female) {
            System.out.println(person1);
        }
        System.out.println("-----------------------------------------");

        List<Person> people = person.stream().filter(p -> FEMALE.equals(p.gender)).collect(Collectors.toList());
        people.forEach(System.out::println);
        person.stream().filter(p -> FEMALE.equals(p.gender)).collect(Collectors.toList()).forEach(System.out::println);
        person.stream().filter(p -> FEMALE.equals(p.gender)).forEach(System.out::println);
        person.removeIf(person1 -> FEMALE.equals(person1.gender));
        System.out.println(person);

    }

    static class Person {
        private final String name;
        private final Gender gender;

         Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
