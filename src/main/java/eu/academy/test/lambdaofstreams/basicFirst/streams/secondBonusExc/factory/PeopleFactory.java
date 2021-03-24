package eu.academy.test.lambdaofstreams.basicFirst.streams.secondBonusExc.factory;

import eu.academy.test.papildoma1.Person;
import eu.academy.test.service.PersonList;

import java.util.ArrayList;
import java.util.List;

public class PeopleFactory {
    public static List<Person> generateListOfPeopleFromPeopleTxtFile() {
        return PersonList.getRandomList();
    }

    public static List<Person> generateANewListWithFewDifferentNames() {
        List<Person> newListOfPeople = new ArrayList<>();
        newListOfPeople.add(new Person("aaa", "bbb"));
        newListOfPeople.add(new Person("aaa", "bbb"));
        newListOfPeople.add(new Person("ccc", "dddd"));
        newListOfPeople.add(new Person("ccc", "bbb"));
        newListOfPeople.add(new Person("ccc", "ssss"));
        newListOfPeople.add(new Person("aaa", "bbb"));
        newListOfPeople.add(new Person("ff", "bbb"));
        newListOfPeople.add(new Person("ff", "bbb"));
        newListOfPeople.add(new Person("kk", "aaa"));
        return newListOfPeople;
    }
}
