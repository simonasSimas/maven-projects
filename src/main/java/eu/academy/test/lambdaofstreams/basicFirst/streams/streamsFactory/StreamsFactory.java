package eu.academy.test.lambdaofstreams.basicFirst.streams.streamsFactory;

import eu.academy.test.papildoma1.FileReader;
import eu.academy.test.papildoma1.Person;
import eu.academy.test.service.PersonList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFactory {
    public static List<String> getOnlyNames(List<Person> list) {
        ArrayList<String> names = new ArrayList<>();
        list
                .forEach(person -> names.add(person.getName()));
        return names;
    }

    public static List<String> getOnlyUniqueNames(List<Person> list) {

        List<String> uniqueNames = new ArrayList<>();
        list
                .forEach(person -> uniqueNames.add(person.getName()));
        return uniqueNames.stream()
                .distinct()
                .collect(Collectors.toList());

    }
    public static List<String> namesSorted(List<Person> list){
        return getOnlyNames(list).stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
