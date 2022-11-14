package com.nicolas.savoini.optional;

import java.util.Optional;

public class OptionalTraining {

    public void createOptional() {

        // If variable cannot be null
        Optional<String> oString =  Optional.of("my string");

        // If variable can be null
        Optional<String> oStringNull = Optional.ofNullable(null);

        // Create empty Optional
        Optional<String> empty = Optional.empty();
    }

    public void checkAndReadOptional() {

        Optional<String> oString =  Optional.of("my string");

        // Check if there is a value
        if (oString.isPresent()) {
            System.out.println("There is a value");

            // Use the optional
            String string = oString.get();
        }

        // Check if there is NO value
        if (oString.isEmpty()) {
            System.out.println("There is NO value");

            // Use a default value
            String string = oString.orElse("Default Value");

            // Or Else can be use with a function

            String defaultString = oString.orElseGet(() -> getDefault());

            // or with Lambda
            String defaultString2 = oString.orElseGet(this::getDefault);
        }

    }

    private String getDefault() {

        return "Default Value";
    }

}
