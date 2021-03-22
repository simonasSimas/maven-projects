package eu.academy.test.translator;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    static private final Map<String, String> translations = new HashMap<String, String>() {{
        put("hello", "Welcome to our app");
        put("entry_added", "Entry has been added");
        put("logout", "Logout");
    }};


    static String toLocale(String key) {
        return translations.get(key);
    }
}