package main.unittest;

import main.unittest.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(2,2);
        System.out.println(result);

    }
}
