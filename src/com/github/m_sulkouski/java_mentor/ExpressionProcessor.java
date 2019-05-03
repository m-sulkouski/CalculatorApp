package com.github.m_sulkouski.java_mentor;

class ExpressionProcessor implements NumberConverter, OperatorConverter {
    private String operator;
    private int firstNumber;
    private int secondNumber;
    Calculator calculator;
    private boolean legalExpression;


    public ExpressionProcessor(String expression) {
        legalExpression = convertExpression(expression.split(" "));
        if (legalExpression)
            calculator = new Calculator(this.firstNumber, this.secondNumber, this.operator);
    }

    private boolean convertExpression(String[] splitExpression) {        //Converts first and third strings to numbers, 2nd to operator. Returns true if legal expression, false if illegal
        try {
            if (splitExpression.length > 3) {
                System.out.println("Only two operands allowed!");
                return false;
            }

            this.firstNumber = convertToArabic(splitExpression[0]);
            this.secondNumber = convertToArabic(splitExpression[2]);
            if (firstNumber == 0 || secondNumber == 0) {
                firstNumber = romanToArabic(splitExpression[0]);
                secondNumber = romanToArabic(splitExpression[2]);
                if(firstNumber == 0 || secondNumber == 0) {
                    firstNumber = 0;
                    secondNumber = 0;
                    System.out.println("At less one number is irrelevant!");
                    return false;
                }
            }
            this.operator = operatorConvert(splitExpression[1]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("At less two operands required!");
            return false;
        }

        catch (NumberFormatException e) {
            System.out.println("Wrong number format!");
            return false;
        }

        catch (NullPointerException e) {
            System.out.println("Wrong operator!");
            return false;
        }

        return true;
    }


    public boolean isLegalExpression() {
        return legalExpression;
    }
}
