package eu.academy.test.service;

public class Startup implements Starter {
    @Override
    public String start(String startupName, String founderName) {
        return startupName + " " + founderName;
    }

    public void finish() {
        System.out.println(Starter.finish()
        );
    }
}