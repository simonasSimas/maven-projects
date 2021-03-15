package eu.academy.test;

import java.util.Collections;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        Y y = new Y();
        y.addList(new X());
        y.addList(new X());
        y.addList(new X());
        y.addList(new X());
        y.addList(new X());
        y.addList(new X());
        y.addList(new X());
        System.out.println(y.getList().toString());
        Collections.sort(y.getList(),new SumComparator());
        System.out.println(y.getList().toString());
        Collections.sort(y.getList(), Collections.reverseOrder(new SumComparator()));
        System.out.println(y.getList().toString());
    }
}