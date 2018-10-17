package org.arquillian.example;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * Created by Yekaterina Savelyeva
 * on 16.10.2018
 */
/**
 * A component for creating personal greetings.
 */

public class Greeter {

    private PhraseBuilder phraseBuilder;

    @Inject
    public Greeter(PhraseBuilder phraseBuilder) {
        this.phraseBuilder = phraseBuilder;
    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }
}
