package com.nicolas.savoini.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Player implements PostalAddressInterface {

    private String firstName;
    private String lastName;

    private Team team;

    private String address;

    @Override
    public String getMailAddress() {

        String name = firstName + " " + lastName;
        return name + "\n" + address + "\n";
    }
}
