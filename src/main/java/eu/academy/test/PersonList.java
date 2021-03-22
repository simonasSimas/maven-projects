package eu.academy.test;

import eu.academy.test.papildoma1.FIleReader;
import eu.academy.test.papildoma1.Person;

import java.util.List;

public class PersonList {
    public static List<Person> getRandomList(){
        return FIleReader.copyList();
    }
}
