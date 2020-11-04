package com.kodilla;

public class Calculator {

    public int calcAdd(int a, int b) {
        return a + b;
    }

    public int calcSub(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.calcAdd(10,12));
        System.out.println(calc.calcSub(4, 3));
        System.out.println("Hello cruel world");
    }
}
