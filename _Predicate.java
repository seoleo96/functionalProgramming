package com.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Predicate {
    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Mike"),
                new Person("Michael"),
                new Person("Leonardo"),
                new Person("Seo")
        );


        person.stream().filter(personPredicate).forEach(System.out::println);




    }

    static Predicate<Person> personPredicate = p -> p.name.length() > 3;

    static class Person {
        private final String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
