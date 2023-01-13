package com.nicolas.savoini.inheritance;

public class SynchronizedSwimmingSport extends NatationSport {
    public SynchronizedSwimmingSport(String name, String rules) {

        super(name, rules);
    }

    @Override
    public void displayPoolSize() {

        System.out.println("Synchronized natation Pool Size");
    }
}
