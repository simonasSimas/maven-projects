package eu.academy.test;


import eu.academy.test.service.PersonManager;

import java.util.List;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PersonManager pm = new PersonManager();
        pm.createPersonObjectFromPeopleDataLine();
        pm.addSentAndReceivedAmountsToObject(pm.refractorFileToStringList(), pm.getMap());
        System.out.println(pm.getMap().get(3297));

//        Box box = new Box();
//        box.set(67);
//        Integer sveikasSk = (Integer) box.get();
//
//        box.set("kazkas");
//    }
    }
}
