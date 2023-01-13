package com.nicolas.savoini.inheritance;

public class SwimmingSport extends NatationSport {
    public SwimmingSport(String name, String rules) {

        super(name, rules);
    }

    @Override
    public void displayPoolSize() {

        System.out.println("Swimming pool size");
    }
}
