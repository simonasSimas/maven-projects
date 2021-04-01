package eu.academy.test;

public class TestThreadClass implements Runnable {

    private String threadName;

    public TestThreadClass(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        for (int count = 1, row = 1; row<20;
        row++, count++){
            for (int i = 0; i<count; i++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
