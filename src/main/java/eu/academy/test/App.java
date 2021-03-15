package eu.academy.test;

import java.lang.reflect.Array;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        Integer[] numbs = {1,2,3};
        String[] words = {"Hello", "World"};

        App app = new App();
        app.arrayPrint(numbs);
        app.arrayPrint(words);

    }
    public <T> void arrayPrint(T[] array){
        for (T element : array){
            System.out.println(element.toString());
        }
    }
}