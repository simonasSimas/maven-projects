package eu.academy.test;

import eu.academy.test.service.FindWithMaxAverage;
import eu.academy.test.service.ListOfNumbers;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(1.5d);
        listObject1.addNumber(10d);
        listObject1.addNumber(2.5d);
        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(0d);
        listObject2.addNumber(1d);
        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(100d);
        ListOfNumbers result1 =  new FindWithMaxAverage().findWithMaxAverage(listObject1, listObject2, listObject3);
        ListOfNumbers result2 = new FindWithMaxAverage().findWithMaxAverage(listObject1, listObject2);
        System.out.println(result1.toString());
        System.out.println(result2.toString());
    }
}