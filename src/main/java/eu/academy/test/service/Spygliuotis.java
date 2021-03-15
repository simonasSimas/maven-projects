package eu.academy.test.service;

public class Spygliuotis implements Medis{
    @Override
    public <T> String turi(T object) {
        if (object instanceof Spygliuotis){
            return object.getClass().getSimpleName() + " turi spyglius";
        }
        return null;
    }
}
