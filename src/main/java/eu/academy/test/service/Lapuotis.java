package eu.academy.test.service;

public class Lapuotis implements Medis{

    @Override
    public <T> String turi(T object) {
        if (object instanceof Lapuotis){
            return object.getClass().getSimpleName() + " turi lapus";
        }
        return null;
    }
}
