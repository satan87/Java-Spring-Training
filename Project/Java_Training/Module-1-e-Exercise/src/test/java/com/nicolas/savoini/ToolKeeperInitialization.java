package com.nicolas.savoini;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Getter
public class ToolKeeperInitialization {


    // Person
    private static Person jane = new Person("Jane");
    private static Person joe = new Person("Joe");
    private static Person jack = new Person("Jack");
    private static Person nick = new Person("Nick");
    private static Person bob = new Person("Bob");

    // Tools
    private static Tool hammer = new Tool(jane, "Hammer");
    private static Tool axe = new Tool(jane, "Axe");
    private static Tool screwdriver = new Tool(joe, "Screwdriver");
    private static Tool chainsaw = new Tool(jane, "Chainsaw");

    public static ToolKeeper getKeeper() {

        ToolKeeper keeper = new ToolKeeper();

        // Renting Over
        Renting rentingOne = new Renting(hammer, joe,
                LocalDate.of(2022, 10, 1),
                Optional.of(LocalDate.of(2022, 10, 5)));

        Renting rentingTwo = new Renting(axe, joe,
                LocalDate.of(2022, 10, 11),
                Optional.of(LocalDate.of(2022, 10, 13)));

        Renting rentingThree = new Renting(screwdriver, joe,
                LocalDate.of(2022, 10, 14),
                Optional.of(LocalDate.of(2022, 10, 16)));

        Renting rentingFour = new Renting(chainsaw, joe,
                LocalDate.of(2022, 10, 20),
                Optional.of(LocalDate.of(2022, 10, 22)));

        Renting rentingFive = new Renting(hammer, jane,
                LocalDate.of(2022, 10, 7),
                Optional.of(LocalDate.of(2022, 10, 14)));


        Renting rentingSeven = new Renting(axe, bob,
                LocalDate.of(2022, 10, 1),
                Optional.of(LocalDate.of(2022, 10, 9)));


        // Renting in Progress
        Renting rentingSix = new Renting(hammer, nick,
                LocalDate.of(2022, 10, 16),
                Optional.empty());

        keeper.getTools().addAll(List.of(hammer, axe, screwdriver, chainsaw));
        keeper.getRents().addAll(List.of(rentingOne, rentingTwo, rentingThree, rentingFour, rentingFive, rentingSix, rentingSeven));

        return keeper;
    }

    public static List<Tool> getTools() {

        return List.of(axe, chainsaw, hammer, screwdriver);
    }

    public static List<Tool> getTools1() {

        return List.of(axe, chainsaw, screwdriver);
    }

    public static Tool getHammer() {

        return hammer;
    }

    public static Tool getChainsaw() {

        return chainsaw;
    }

    public static Person getJack() {

        return jack;
    }

    public static Person getJoe() {

        return joe;
    }

}
