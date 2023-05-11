package com.nicolas.savoini.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Team implements PostalAddressInterface {

    private String name;

    private String city;

    private String manager;

    @Override
    public String getMailAddress() {

        return "For " + manager + "\n" + " For Team " + name + " in " + city + "\n";
    }
}
