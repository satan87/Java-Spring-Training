package com.nicolas.savoini.lambda;


import lombok.Getter;

import java.util.List;

@Getter
public class LambdaExercise {

    private final Department accounting = new Department(1,"Accounting");
    private final Department marketing = new Department(2,"Marketing");
    private final Department hr = new Department(3,"HR");
    private final Department it = new Department(4,"IT");
    private final Department sales = new Department(5,"Sales");

    private Department empty = new Department(6,"Empty");

    private List<Department> departments = List.of(accounting, marketing, hr, it, sales, empty);

    private List<Person> persons = List.of(
            new Person("John", accounting),
            new Person("Jane", accounting),
            new Person("Bob", marketing),
            new Person("Mike", marketing),
            new Person("Nicholas", marketing),
            new Person("Rachel", marketing),
            new Person("Mary", hr),
            new Person("Rahul", it),
            new Person("Elaine", it),
            new Person("Chris", it),
            new Person("Sarah", sales),
            new Person("Coline", sales),
            new Person("Marc", sales),
            new Person("Rachel", sales),
            new Person("Jane", sales)
    );




    /**
     * TODO - Complete the class to pass all the tests
     */




}
