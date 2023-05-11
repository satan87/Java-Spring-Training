package com.nicolas.savoini;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        record Person(String firstName, String lastName) {}

        Person nico = new Person("Nico", "Las");

        System.out.println(nico.firstName() + " " + nico.lastName());

        System.out.println(nico);


//        nico.firstName = "N"; // -> This code will not compile

    }

    record MyPossibleNumber(Optional<Integer> number, String reason) {}

    MyPossibleNumber getSomeValues() {

        // do match

        // eventually failed
        try {
            //some piece of business code that fails for a specific reason
        } catch (Exception e) {
            e.printStackTrace();
            //reason is A
            return new MyPossibleNumber(Optional.empty(), "Reason A");
        }

        try {
            //some code
        } catch (Exception e) {
            e.printStackTrace();
            //reason is B
            return new MyPossibleNumber(Optional.empty(), "Reason B");
        }

        // return
        return new MyPossibleNumber(Optional.of(1), "Process OK");
    }

}
