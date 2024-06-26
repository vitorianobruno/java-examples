package com.java.examples;

import com.java.examples.app.Calculator;

public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.evaluate("1 3 +"));

    }

}
