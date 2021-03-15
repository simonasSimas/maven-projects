package eu.academy.test;


import eu.academy.test.service.SuperPair;

/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        SuperPair<String, Double, Number> superPair1 = new SuperPair<>("a", 1.2, 10);
        SuperPair<String, String, Number> superPair2 = new SuperPair<>("a", "b", 10);
        SuperPair<String, String, Number> superPair3 = new SuperPair<>("a", "b", "10");

    }
}