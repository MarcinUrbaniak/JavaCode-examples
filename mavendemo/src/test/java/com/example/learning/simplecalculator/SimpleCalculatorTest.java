package com.example.learning.simplecalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    void add(){
        Assertions.assertEquals(5, SimpleCalculator.add(4,1));
    }

    @Test
    void multiply(){
        Assertions.assertEquals(4, SimpleCalculator.multiply(2,2));
    }
}
