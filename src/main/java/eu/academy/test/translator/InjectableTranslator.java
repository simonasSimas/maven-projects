package eu.academy.test.translator;

import java.util.function.Function;

public class InjectableTranslator implements Function<String, String> {
    @Override
    public String apply(String s) {
        return Translator.toLocale(s);
    }
}
