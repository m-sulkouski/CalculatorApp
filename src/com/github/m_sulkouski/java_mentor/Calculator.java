package com.github.m_sulkouski.java_mentor;


class Calculator {

    private int result;

    public Calculator(int firstNumber, int secondNumber, String operator) {

        calculate(firstNumber, secondNumber, operator);
    }

    public void calculate(int firstNumber, int secondNumber, String operator) {
        if (operator.equals("/"))
            this.result = firstNumber / secondNumber;
        if (operator.equals("*"))
            this.result = firstNumber * secondNumber;
        if (operator.equals("+"))
            this.result = firstNumber + secondNumber;
        if (operator.equals("-"))
            this.result = firstNumber - secondNumber;
    }


    public int getResult() {
        return result;
    }
}
