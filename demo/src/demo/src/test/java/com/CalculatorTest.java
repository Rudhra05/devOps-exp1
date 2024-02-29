package com;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }
}
