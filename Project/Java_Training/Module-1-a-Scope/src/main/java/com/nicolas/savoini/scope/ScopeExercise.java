package com.nicolas.savoini.scope;

import java.util.List;

public class ScopeExercise {

    /*** TODO
     * 1. Define variable message; only once
     * 2. Add necessary code to access message variable from another class
     * 3. What is the scope of newMessage
     * 4. Line 23 (System.out.println( ... );) -> Which variable can we use at this point ? Which one make more sense ?
     */

    /*** INFO
     * Do not change method parameters
     */

    public void start() {

        message = "Start ...";

        for (String name : List.of("John", "Jane")) {
            System.out.println( ... );
        }

    }


    public void stop() {

        message = "Stop ...";

        String newMessage = "We going to stop";
        doSomething(newMessage);

    }

    public void pause() {

        message = "Pause ...";
    }

    private void doSomething(String msg) {

        System.out.println(msg);
    }

}
