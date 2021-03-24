package eu.academy.test.lambdaofstreams.basicFirst.streams.secondBonusExc.service;

import eu.academy.test.lambdaofstreams.basicFirst.streams.secondBonusExc.factory.PeopleFactory;
import eu.academy.test.papildoma1.Person;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFactory {

    public static Map<String, Long> getMapOfPeople() {
        List<Person> listOne = PeopleFactory.generateListOfPeopleFromPeopleTxtFile();
        List<Person> listTwo = PeopleFactory.generateANewListWithFewDifferentNames();
        BiFunction<List<Person>, List<Person>, List<Person>> function = (list1, list2) -> Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        List<Person> combinedList = function.apply(listOne, listTwo);
        return combinedList.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
    }
}
