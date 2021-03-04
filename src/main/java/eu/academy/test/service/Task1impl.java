package eu.academy.test.service;

import java.util.Calendar;

public class Task1impl implements Tasks {

    @Override
    public String tryVarargs(Object... values) {
        String a = "";
        for (Object i : values) {
            if (i instanceof Calendar) {
                a += (((Calendar) i).get(Calendar.DAY_OF_MONTH));
                a = a.concat("-");
                a += (((Calendar) i).get(Calendar.MONTH) + 1);
                a = a.concat("-");
                a += (((Calendar) i).get(Calendar.YEAR));
                a = a.concat("\n");
            } else {
                a = a.concat(i.toString() + "\n");
            }
        }
        return a;
    }
}
