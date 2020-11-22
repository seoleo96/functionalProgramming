package com.functionalProgramming;

import java.util.function.*;

public class _Consumer {
    public static void main(String[] args) {
        var maria = new Customer("Maria", "77777");
        showCustomer.accept(maria);
    }

    static Consumer<Customer> showCustomer =
            p -> System.out.println("My name is " + p.name + ", my phone number is " + p.phoneNumber);

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
