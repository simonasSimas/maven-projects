package eu.academy.test.lambdaofstreams.basicFirst.streams.bonusExc;

import eu.academy.test.lambdaofstreams.basicFirst.streams.bonusExc.bonusExcGeneric.DistinctById;
import eu.academy.test.papildoma1.Person;

import java.util.*;
import java.util.stream.Collectors;

public class BonusExcRun {
    public static Map<Integer, String> mapOfPersonList(List<Person> personList) {
        return getDistinctPersonList(personList).stream()
        .collect(Collectors.toMap(Person::getId,person -> person.getName() +" " + person.getLastName()));
    }

    public static List<Person> getDistinctPersonList(List<Person> personList) {
        Set<Person> set = new HashSet<>();
        List<Person> newListOfDistinctPeopleSortedByDescending = personList.stream()
                .sorted(Comparator.comparingInt(Person::getId).reversed())
                .collect(Collectors.toList());
        newListOfDistinctPeopleSortedByDescending.stream()
                .filter(new DistinctById<>(Person::getId)::filterById)
                .forEach(set::add);
        List<Person> listPerson = new ArrayList<>(set);
        return listPerson.stream()
                .sorted(Comparator.comparingInt(Person::getId).reversed())
                .collect(Collectors.toList());
    }

//    public static List<Person> getDistinctPersonList(List<Person> personList) {
//        List<Person> newListOfDistinctPeopleSortedByDescending = personList.stream()
//                .sorted(Comparator.comparingInt(Person::getId).reversed())
//                .collect(Collectors.toList());
//        List<Person> listPerson = new ArrayList<>(newListOfDistinctPeopleSortedByDescending.stream()
//                .filter(new DistinctById<>(Person::getId)::filterById)
//                .collect(Collectors.toList()));
//        return listPerson.stream()
//                .sorted(Comparator.comparingInt(Person::getId).reversed())
//                .collect(Collectors.toList());
//    }
}
