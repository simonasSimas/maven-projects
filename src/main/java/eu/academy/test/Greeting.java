package eu.academy.test;

import java.util.List;
import java.util.Locale;

public class Greeting {

    private final static String HELLO = "Hello";
    public String greet(Object name) {
        if (name == null) {
            return HELLO + ", my friend.";
        } else if (name instanceof String) {
            if (name.equals(((String) name).toUpperCase())) {
                return "HELLO " + name + "!";
            } else{
                return HELLO + ", " +name + ".";
            }
        } else if (name instanceof List) {
            if (((List<?>) name).size() == 1) {
                return HELLO + ", " + name + ".";
            }else if(((List<?>) name).size()==2){
                return HELLO + ", " + ((List<?>) name).get(0) + " and " + ((List<?>) name).get(1);
            }else if (((List<?>) name).size()>2){
                String hello = HELLO;
                for (int i = 0; i<((List<?>) name).size()-1; i++){
                    hello = hello.concat(", " + ((List<?>) name).get(i));
                }
                return hello.concat(" and " + ((List<?>) name).get(((List<?>) name).size()-1) + ".");
            }
        }
        return null;
    }
}
