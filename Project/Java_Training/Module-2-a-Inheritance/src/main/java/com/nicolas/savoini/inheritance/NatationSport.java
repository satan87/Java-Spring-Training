package com.nicolas.savoini.inheritance;

public abstract class NatationSport extends Sport {

    public NatationSport(String name, String rules) {

        super(name, rules);
    }

    public abstract void displayPoolSize();
}
