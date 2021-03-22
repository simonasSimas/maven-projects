package eu.academy.test.papildoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIleReader {


    public List<Person> copyList() {
        int d = 0;
        File file = new File("people.txt");
        Scanner scanner = null;

        {
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        ArrayList<Person> peopleList = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String person = scanner.nextLine();
            int id = Integer.parseInt(person.substring(0, 4));
            String name = person.substring(person.indexOf(',') + 2, person.lastIndexOf(',') + 1);
            String lastName = person.substring(person.lastIndexOf(',') + 2);
            peopleList.add(new Person(id, name, lastName));
        }
        return peopleList;
    }
}
