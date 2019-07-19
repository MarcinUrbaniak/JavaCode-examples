package com.example.learning.simplecalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTests {
    @Test
    public void exampleTest(){

        boolean isSuccess = true;
        Assertions.assertTrue(isSuccess);

        boolean hasError = false;
        Assertions.assertFalse(hasError);

        String hello = null;
        Assertions.assertNull(hello);

        hello = "Hello world";
        Assertions.assertNotNull(hello);
        Assertions.assertEquals("Hello world", hello);
        Assertions.assertNotEquals("Witaj swiecie", hello);
    }

}
