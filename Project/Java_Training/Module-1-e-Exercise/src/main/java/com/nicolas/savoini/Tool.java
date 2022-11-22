package com.nicolas.savoini;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Tool {

    private Person owner;
    private String name;
}
