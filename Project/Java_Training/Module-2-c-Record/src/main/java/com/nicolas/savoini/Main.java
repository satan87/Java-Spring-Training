package com.nicolas.savoini;

public class Main {

    public static void main(String[] args) {

        record Person(String firstName, String lastName) {};

        Person nico = new Person("Nico", "Las");

        System.out.println(nico.firstName() + " " + nico.lastName());

        System.out.println(nico);


//        nico.firstName = "N"; -> This code will not compile

    }
}