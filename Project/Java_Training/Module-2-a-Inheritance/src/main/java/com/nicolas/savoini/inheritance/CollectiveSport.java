package com.nicolas.savoini.inheritance;

import lombok.Getter;

@Getter
public class CollectiveSport extends Sport {

    private int numberOfPlayerPerTeam;

    public  CollectiveSport(String name, String rules, int numberOfPlayerPerTeam) {
        super(name, rules);
        this.numberOfPlayerPerTeam = numberOfPlayerPerTeam;
    }

}
