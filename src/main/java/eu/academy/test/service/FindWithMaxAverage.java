package eu.academy.test.service;

public class FindWithMaxAverage {

    public ListOfNumbers findWithMaxAverage(ListOfNumbers... listOfNumbers){
        ListOfNumbers list= null;
        double avg = 0;
        for (ListOfNumbers d: listOfNumbers){
            if (d.getAverage()>avg){
                avg = d.getAverage();
                list = d;
            }
        }
        return list;
    }
}
