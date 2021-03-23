package eu.academy.test.lambdaofstreams.basicFirst.streams.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunLambda {
    public static void run() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list2.add("f");
        list2.add("g");
        list2.add("h");
        list2.add("i");
        list2.add("j");
        BiFunction<List<String>, List<String>, List<String>> function;
        function = (listOne, listTwo) -> Stream.concat(listOne.stream(), listTwo.stream())
                .collect(Collectors.toList());
        List<String> sortedList = function.apply(list1, list2);
        System.out.println(sortedList.toString());
    }
}
