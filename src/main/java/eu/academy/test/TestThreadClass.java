package eu.academy.test;

public class TestThreadClass extends Thread {

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
                System.out.println("*");
            }
            System.out.println('\n');
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
