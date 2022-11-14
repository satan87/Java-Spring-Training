package com.nicolas.savoini.scope;

public class ScopeTraining {

    private String classVariable = "This can be used every where in the class";

    public void myFunction(String parameter) {

        String functionVariable = "This can be used only in the function myFunction ";

        String p = parameter; // Parameter has a function scope, it can be used only in the function

    }


    public void myOtherFunction() {

        for (int i = 0; i < 5; i++) {
            String localScope = String.valueOf(i);  // localScope, and i can only be used inside the for loop.
        }

    }

    // The GETTER allows other class to access our private value
    public String getClassVariable() {

        return classVariable;
    }
}
