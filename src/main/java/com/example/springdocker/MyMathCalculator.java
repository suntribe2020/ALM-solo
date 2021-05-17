package com.example.springdocker;

/**
 * Created by Katri Vidén
 * Date: 2021-05-13
 * Time: 18:38
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class MyMathCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (a == 0 || b == 0) {
            throw new NullPointerException("Can't divide with 0");
        }
        return a / b;
    }
}
