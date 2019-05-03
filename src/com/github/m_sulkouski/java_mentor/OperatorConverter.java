package com.github.m_sulkouski.java_mentor;

interface OperatorConverter {
    default String operatorConvert(String operator) {
        if (operator.equals("/") || operator.equals("*") || operator.equals("-") || operator.equals("+"))
            return operator;
        else
            return null;
    }
}
