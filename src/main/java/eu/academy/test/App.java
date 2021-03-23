package eu.academy.test;


import eu.academy.test.service.Starter;
import eu.academy.test.service.Startup;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Startup startup = new Startup();
        System.out.println(startup.start("Vardenis", "Pavardenis"));
        startup.progress();
        startup.finish();
//        2
        Startup startupAnonymous = new Startup() {
            @Override
            public String start(String startupName, String founderName) {
                return startupName + " " + founderName;
            }

            public void finish() {
                System.out.println(Starter.finish()
                );
            }
        };
        System.out.println(startupAnonymous.start("a2", "b2"));
        startupAnonymous.progress();
        startupAnonymous.finish();
//        3
        Startup startupAnonymousThirdExc = new Startup() {
            Starter starterWithBody = new Starter() {
                @Override
                public String start(String startupName, String founderName) {
                    return startupName + " " + founderName;
                }
            };
        };
        System.out.println(startupAnonymousThirdExc.start("a3", "b3"));
        startupAnonymousThirdExc.progress();
        startupAnonymousThirdExc.finish();
        //3.1
        Startup startupAnonymousLambda = new Startup() {
            Starter starter = (startupName, founderName) -> startupName + " " + founderName;
        };
        System.out.println(startupAnonymousLambda.start("aa3", "bb3"));
        startupAnonymousLambda.progress();
        startupAnonymousLambda.finish();
    }
}