package com.nicolas.savoini.inheritance;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Sport {

    /**
     * Private member are not accessible from other class, even children
     * We need to define getters and setters if necessary
     */
    private String name;
    private String rules;

    /**
     * Protected field are accessible from all other class in the same package
     */
    protected boolean good = true;

    public Sport(String name, String rules) {

        this.name = name;
        this.rules = rules;
    }
}
