package eu.academy.test;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TestThreadClass ttc = new TestThreadClass("Thread-I");
        ttc.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("i + i = " + (i+i) +", i * i = " + i*i);
        }
    }
}
