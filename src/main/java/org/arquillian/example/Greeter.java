package org.arquillian.example;

import java.io.PrintStream;

/**
 * Created by Yekaterina Savelyeva
 * on 16.10.2018
 */
/**
 * A component for creating personal greetings.
 */

public class Greeter {
    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
