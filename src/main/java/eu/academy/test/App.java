package eu.academy.test;

import eu.academy.test.model.Person;
import eu.academy.test.service.PersonImpl;

import java.io.*;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {


        Person person = new PersonImpl().personReader();
        System.out.println(person.getName() + person.getLastName());
    }
}
