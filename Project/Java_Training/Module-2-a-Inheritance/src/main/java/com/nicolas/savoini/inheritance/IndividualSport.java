package com.nicolas.savoini.inheritance;

public class IndividualSport extends Sport {

    public IndividualSport(String name, String rules) {

        super(name, rules);
    }

    @Override
    public String toString() {

        return new StringBuilder()
                .append("Tennis:: [ ")
                .append("name=").append(getName()).append(", ")
                .append("rules=").append(getRules()).append(", ")
                .append("isGood=").append(good)
                .append("]")
                .toString();
    }

}
