package eu.academy.test.service;

import eu.academy.test.papildoma1.FileReader;
import eu.academy.test.papildoma1.Person;

import java.util.List;

public class PersonList {
    public static List<Person> getRandomList(){
        return FileReader.copyList();
    }
}
