package com.nicolas.savoini.ternary;

public class TernaryTraining {

    public void myFunction() {

        // Classic if
        String name = "John";
        String same = "";
        if (name.equals("Jane")) {
            same = "yes";
        } else {
            same = "no";
        }

        // Ternary
        String same2 = (name.equals("Jane")) ? "yes" : "no";

    }

}
