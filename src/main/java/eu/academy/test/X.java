package eu.academy.test;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class X implements Comparator<X> {
    Random rand = new Random();
    private int[] xList = {rand.nextInt(), rand.nextInt(), rand.nextInt()};

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int[] getxList() {
        return xList;
    }

    public void setxList(int[] xList) {
        this.xList = xList;
    }

    public int sum() {
        int sum = 0;
        for (int a : xList
        ) {
            sum += a;

        }
        return sum;
    }

    public int compare(X o1, X o2) {
        return o1.sum()-o2.sum();
    }

    @Override
    public String toString() {
        return "X{" +
                "xList=" + Arrays.toString(xList) + sum() +
                '}';
    }
}
