package eu.academy.test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    @Test
    public void sumOfTwo_shouldReturnValidSum(){
        Maths math = new Maths();
        assertEquals(10,math.sumOfTwo(4,6));
    }
}