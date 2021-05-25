package com.example.springdocker;

/**
 * Created by Katri Vidén
 * Date: 2021-05-13
 * Time: 18:38
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class MyMathCalculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double numerator, double denominator) {
        if (numerator == 0 || denominator == 0) {
            throw new IllegalArgumentException("Can't divide with 0");
        }
        return numerator / denominator;
    }
}
