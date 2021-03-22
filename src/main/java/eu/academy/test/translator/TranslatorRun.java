package eu.academy.test.translator;

public class TranslatorRun {
    public static void main(String[] args) {
        InjectableTranslator injectableTranslator = new InjectableTranslator();
        SpeechEngine speechEngine = new SpeechEngine(injectableTranslator);
        System.out.println(speechEngine.speak("hello"));
    }
}
