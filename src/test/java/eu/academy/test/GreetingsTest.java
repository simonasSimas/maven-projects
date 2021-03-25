package eu.academy.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    @Test
    public void test1(){
        Greeting greeting = new Greeting();
        assertEquals("Hello, Hob.", greeting.greet("Hob"));
    }
    @Test
    public void test2(){
        Greeting greeting = new Greeting();
        assertEquals("Hello, my friend.", greeting.greet(null));
    }
    @Test
    public void test3(){
        Greeting greeting = new Greeting();
        assertEquals("HELLO JEREMY!", greeting.greet("JEREMY"));
    }
    @Test
    public void test4(){
        Greeting greeting = new Greeting();
        List<String> list = new ArrayList<>();
        list.add("Jill");
        list.add("Jane");
        assertEquals("Hello, Jill and Jane", greeting.greet(list));
    }
    @Test
    public void test5(){
        Greeting greeting = new Greeting();
        List<String> list = new ArrayList<>();
        list.add("Jill");
        list.add("Jane");
        list.add("Rob");
        assertEquals("Hello, Jill, Jane and Rob.", greeting.greet(list));
    }
}
