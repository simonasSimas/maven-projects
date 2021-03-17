package eu.academy.test.service;

public class SuperPair <T1,T2, N extends Number>{
    private T1 a;
    private T2 b;
    private N n;

    public SuperPair(T1 a, T2 b, N n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }
}
