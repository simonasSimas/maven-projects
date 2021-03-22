package eu.academy.test.translator;


import java.util.function.Function;

public class SpeechEngine {

    Function<String, String> translator;

    public SpeechEngine(Function<String, String> translator) {
        this.translator=translator;
    }

    public String speak(String key){
        return translator.andThen(String::toUpperCase).apply(key);
    }
}
