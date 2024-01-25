package com.example.junit;

public class MathApplication {

    private Calculator calculator;

    public MathApplication(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculator.sub(a, b);
    }

    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    public int divide(int a, int b) {
        return calculator.divide(a, b);
    }
}

