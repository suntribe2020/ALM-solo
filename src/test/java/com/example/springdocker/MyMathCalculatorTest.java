package com.example.springdocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by Katri Vidén
 * Date: 2021-05-14
 * Time: 09:25
 * Project: spring-docker-demo
 * Copyright: MIT
 */
class MyMathCalculatorTest {

    MyMathCalculator myMathCalculator;

    @BeforeEach
    public void beforeMethod() {
        myMathCalculator = new MyMathCalculator();
    }

    @Test
    void add() {
        assertEquals(5, myMathCalculator.add(2, 3));
    }

    @Test
    void multiply() {
        assertEquals(25, myMathCalculator.multiply(5, 5));
    }

    @Test
    void divide() {
        assertEquals(10, myMathCalculator.divide(50,5));
        assertEquals(8.2, myMathCalculator.divide(20.5,2.5));
    }

    @Test
    void divideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myMathCalculator.divide(1.5, 0));
        assertThrows(IllegalArgumentException.class, () -> myMathCalculator.divide(0, 1.5));
    }
}
