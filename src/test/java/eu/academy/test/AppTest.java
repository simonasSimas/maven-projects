package eu.academy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class AppTest {
    @Test
    public void xFromulaReturns_succeedIfTrue(){
        long answer0 = X.xFormula(-1);
        long answer1 = X.xFormula(0);
        long answer2 = X.xFormula(1);
        long answer3 = X.xFormula(2);
        long answer4 = X.xFormula(4);

        assertEquals(0,answer0);
        assertEquals(1,answer1);
        assertEquals(3,answer2);
        assertEquals(21,answer3);
        assertEquals(741,answer4);
    }
}