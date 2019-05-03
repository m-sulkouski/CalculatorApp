package com.github.m_sulkouski.java_mentor;


class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String operator;

    public Calculator(int firstNumber, int secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public int calculate() {
        if (operator.equals("/"))
            return divide();
        if (operator.equals("*"))
            return multiply();
        if (operator.equals("+"))
            return add();
        if (operator.equals("-"))
            return subtract();
        return -10;
    }



    private int add() {
        return this.firstNumber + this.secondNumber;
    }

    private int subtract() {
        return this.firstNumber - this.secondNumber;
    }

    private int multiply() {
        return this.firstNumber * this.secondNumber;
    }

    private int divide() {
        return this.firstNumber / this.secondNumber;
    }
}
