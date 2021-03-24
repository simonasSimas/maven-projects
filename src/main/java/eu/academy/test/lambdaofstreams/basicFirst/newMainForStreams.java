package eu.academy.test.lambdaofstreams.basicFirst;

import eu.academy.test.lambdaofstreams.basicFirst.streams.secondBonusExc.service.SecondBonusExcRun;
import eu.academy.test.lambdaofstreams.basicFirst.streams.service.RunLambda;
import eu.academy.test.lambdaofstreams.basicFirst.streams.service.StreamsRun;

public class newMainForStreams {
    public static void main(String[] args) {
        RunLambda.run();
        StreamsRun.run();
        SecondBonusExcRun.run();
    }
}
