package eu.academy.test;

import java.util.ArrayList;
import java.util.List;

public abstract class X {
    public static long xFormula(int x) {
        if (x < 0) {
            return 0;
        }
        long x0 = 1;
        long x1 = 3;
        List<Long> numberList = new ArrayList<>();
        numberList.add(x0);
        numberList.add(x1);
        for (long i = 2; i <= (x + 1); i++) {
            numberList.add((5 * numberList.get(Integer.parseInt("" + i) - 1)) + (6 * numberList.get(Integer.parseInt("" + i) - 2)));
        }
        return numberList.get(x);
    }
}
