package com.github.m_sulkouski.java_mentor;

import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    static boolean repeat = true;


    public static void main(String[] args) {
        String expression;
        System.out.println("Welcome to the Calculator v.1.0 beta\n");

        while (repeat) {
            expression = getExpression();
            ExpressionProcessor processor = new ExpressionProcessor(expression);
            if (processor.isLegalExpression()) {
                System.out.println(processor.getResult());
            }
            else {
                System.out.println("The expression is incorrect!");
                repeat = false;
            }
        }


    }

    public static String getExpression() {
        System.out.println("Please enter the operation:\n");
        return input.nextLine();
    }
}
