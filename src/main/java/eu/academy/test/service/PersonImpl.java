package eu.academy.test.service;

import eu.academy.test.model.Person;

import java.io.*;

public class PersonImpl {
    public void personWriter() {
        FileOutputStream out = null;
        ObjectOutputStream s = null;
        try {
            out = new FileOutputStream("objdata.ser");
            s = new ObjectOutputStream(out);
            s.writeObject(new Person("Simonas", "Sadurskas"));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                s.flush();
                s.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
            public Person personReader () {
                try {
                    FileInputStream in = new FileInputStream("objdata.ser");
                    ObjectInputStream s = new ObjectInputStream(in);
                    Person person = (Person) s.readObject();
                    return person;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
