package eu.academy.test;


import eu.academy.test.model.*;
import eu.academy.test.service.Medis;
import eu.academy.test.service.Miskas;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();

        Object[] ivairusMiskas = {azuolas, berzas, pusis, kadagys,egle};
        Miskas<Medis> medis = new Miskas<>();
        medis.ivairusMiskas(ivairusMiskas);
        Object[] spygliuociuMiskas = {egle, pusis, kadagys};
        medis.spygliuociuMiskas(spygliuociuMiskas);
        Object[] berzuMiskas = {berzas, berzas, berzas};
        medis.berzuMiskas(berzuMiskas);
    }
}