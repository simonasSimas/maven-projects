package eu.academy.test.papildoma2;

import eu.academy.test.PersonList;
import eu.academy.test.papildoma1.Person;

import java.util.function.Predicate;

public class runBonus2 {
    public static void main(String[] args) {
        Predicate<String> personListPredicate = string -> {
            if (string.charAt(0) == 'S') {
                return true;
            }
            return false;
        };

        for (Person p : PersonList.getRandomList()) {
            if (personListPredicate.test(p.getName()) || personListPredicate.test(p.getLastName())) {
                System.out.println(p.toString());
            }
        }
    }
}