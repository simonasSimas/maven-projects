package eu.academy.test.service;

import eu.academy.test.model.Berzas;

public class Miskas<T> {
    public <T> void ivairusMiskas(T[] list) {
        System.out.println("Ivairus miskas: ");
        for (T element : list) {
            if (element instanceof  Spygliuotis){
                System.out.println(((Spygliuotis) element).turi(element));
            }else if (element instanceof Lapuotis){
                System.out.println(((Lapuotis) element).turi(element));
            }
        }
        System.out.println();
    }

    public <T> void spygliuociuMiskas(T[] spygliuociai){
        System.out.println("Spygliuociu miskas: ");
        for (T element : spygliuociai) {
            if (element instanceof Spygliuotis) {
                System.out.println(((Spygliuotis) element).turi(element));
            }
        }
        System.out.println();
    }
    public <T> void berzuMiskas(T[] berzas){
        System.out.println("Berzu miskas: ");
        for (T element : berzas){
            if (element instanceof Berzas){
                System.out.println(((Berzas) element).turi(element));
            }
        }
        System.out.println();
    }
}
