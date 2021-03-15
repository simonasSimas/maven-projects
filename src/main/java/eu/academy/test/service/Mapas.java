package eu.academy.test.service;

import eu.academy.test.model.Pora;

import java.util.HashMap;
import java.util.Map;


public class Mapas <T1, T2> {
    private Map<Object, Pora> sarasasPoru = new HashMap<>();


    public <T1, T2> void ideti(T1 raktas, T2 reiksme) {
        sarasasPoru.put(raktas, new Pora(raktas, reiksme));
    }

    public <T1> T2 gauti(T1 raktas) {
            return ((T2) sarasasPoru.get(raktas).getReiksme());
    }
}
