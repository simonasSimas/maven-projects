package eu.academy.test;

public class Counter {
    public static final String DEFAULT_COUNTER_NUMBER = "000";
    private static String number = DEFAULT_COUNTER_NUMBER;

    private Counter(){

    }

    public static void increaseByOne(){
        try {
            int foo = Integer.parseInt(number);
            number = String.format("%1$03d", foo + 1);
            if (foo == 999){
                setDefaultCounterNumber();
            }else {
                number = number.substring(number.length() - 3);
            }
        } catch (NumberFormatException e){
            System.exit(-1);
        }
    }
    public static void setDefaultCounterNumber(){
        number = DEFAULT_COUNTER_NUMBER;
    }
    public static String getNumber(){
        return number;
    }
}
