package eu.academy.test.papildoma3;

import eu.academy.test.service.PersonList;
import eu.academy.test.papildoma1.Person;

import java.util.Optional;

public class BonusRun3 {
    public static void main(String[] args) {
        System.out.println(findByName("Damien"));
    }
    static Optional<Person> findByName(String name) {
        for (Person p : PersonList.getRandomList()) {
            if (name.equals(p.getName())) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
