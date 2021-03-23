package eu.academy.test.lambdaofstreams.basicFirst.streams.service;

import eu.academy.test.lambdaofstreams.basicFirst.streams.bonusExc.BonusExcRun;
import eu.academy.test.lambdaofstreams.basicFirst.streams.streamsFactory.StreamsFactory;
import eu.academy.test.papildoma1.Person;
import eu.academy.test.service.PersonList;

import java.util.List;

public class StreamsRun {
    public static void run() {
        List<Person> listOfPeople = PersonList.getRandomList();
        System.out.println(StreamsFactory.getOnlyNames(listOfPeople));
        System.out.println(StreamsFactory.getOnlyNames(listOfPeople).size());
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println(StreamsFactory.getOnlyUniqueNames(listOfPeople).toString());
        System.out.println(StreamsFactory.getOnlyUniqueNames(listOfPeople).size());
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println(StreamsFactory.namesSorted(listOfPeople).toString());
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println(BonusExcRun.getDistinctPersonList(listOfPeople).toString());
        System.out.println(BonusExcRun.mapOfPersonList(listOfPeople).toString());
    }
}
