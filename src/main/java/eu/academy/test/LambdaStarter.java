package eu.academy.test;

public class LambdaStarter {

    public static void start(){
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        System.out.println(skaiciuotuvas.sumuok(2,3));


        Sumatorius sumatorius = new Sumatorius() {
            @Override
            public int sumuok(int x, int y) {
                return x + y;
            }
        };
        System.out.println(sumatorius.sumuok(2,3));


        Sumatorius lambdaSumatorius = (int x, int y)->{
            return x + y;
        };
        System.out.println(lambdaSumatorius.sumuok(2,3));

        Sumatorius shortSumatoriusLambda = Integer::sum;
        System.out.println(shortSumatoriusLambda.sumuok(2,3));

    }
}
