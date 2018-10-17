package org.arquillian.example;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yekaterina Savelyeva
 * on 16.10.2018
 */

public class PhraseBuilder {

        private Map<String, String> templates;

        public String buildPhrase(String id, Object... args) {
            return MessageFormat.format(templates.get(id), args);
        }

        @PostConstruct
        public void initialize() {
            templates = new HashMap<String, String>();
            templates.put("hello", "Hello, {0}!");
        }
}
