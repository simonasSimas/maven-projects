package eu.academy.test.service;

import java.util.ArrayList;

public class ListOfNumbers {
    private ArrayList<Double> list = new ArrayList<>();

    public void addNumber(Double numb){
        list.add(numb);
    }

    public Double getAverage(){
        double sum = 0;
        for (Double d : list){
            sum+=d;
        }
        return sum/list.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "list=" + list +
                '}';
    }
}
