package com.example.learning.simplecalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExeptionTestExample {

    private boolean compare(String secret){
        if (secret == null || secret.isEmpty()){
            throw new IllegalArgumentException("Secret is empty");
        }
        return "Hello".equalsIgnoreCase(secret);
    }

    @Test
    public void compare_givenEmptySecret_shouldThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> compare(""));
    }

    @Test
    public void compare_givenNullsecret_shouldThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            compare(null);
        });
    }

    @Test
    public void compare_givenWronngSecret_shouldReturnFalse(){
        boolean compare = compare("Witaj swiecie");
        Assertions.assertFalse(compare);
    }

    @Test
    public void compare_givenCorrectSecret_shouldReturnTrue(){
        boolean compare = compare("Hello");
        Assertions.assertTrue(compare);
    }

}
