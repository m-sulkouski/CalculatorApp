package com.github.m_sulkouski.java_mentor;

class ExpressionProcessor {

    Calculator calculator;
    NumericConverter converter;
    private boolean legalExpression;
    private boolean isArabic;


    public ExpressionProcessor(String expression) {
        convertExpression(expression.split(" "));
    }

    private boolean convertExpression(String[] splitExpression) {        //Converts first and third strings to numbers, 2nd to operator. Returns true if legal expression, false if illegal
        try {
            if (splitExpression.length > 3) {
                System.out.println("Only two operands allowed!");
                legalExpression = false;
                return false;
            }
            String operator = null;
            converter = new NumericConverter();

            int firstNumber = converter.arabicToInteger(splitExpression[0]);
            int secondNumber = converter.arabicToInteger(splitExpression[2]);
            if (firstNumber == 0 || secondNumber == 0) {

                firstNumber = converter.romanToInteger(splitExpression[0]);
                secondNumber = converter.romanToInteger(splitExpression[2]);
                if(firstNumber == 0 || secondNumber == 0) {
                    firstNumber = 0;
                    secondNumber = 0;
                    System.out.println("At less one operand is illegal!");
                    return false;
                }
            }
            else
                this.isArabic = true;

            if (splitExpression[1].equals("/") || splitExpression[1].equals("*") || splitExpression[1].equals("-") || splitExpression[1].equals("+")) {
                operator = splitExpression[1];
                this.legalExpression = true;
            }

            if (legalExpression)
                calculator = new Calculator(firstNumber, secondNumber, operator);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("At less two operands required!");
            return false;
        }

        catch (NumberFormatException e) {
            System.out.println("Wrong operand format!");
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

    public boolean isArabic() {
        return isArabic;
    }

    public String getResult() {
        if (isArabic())
            return "Result: " + calculator.getResult();
        else
            return "Result: " + converter.integerToRoman(calculator.getResult());
    }
}
