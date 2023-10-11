package com.example.calculatorapp;
public class Calculator {
    private double op1;    // to store the first operand
    private double op2;    // to store the second operand
    private String operator;    // to store the arithmetic operator

    // method to perform the calculation
    public double calculator(double a, double b, String operator){
        switch (operator){
            case "+":   // if the operator is equal to +
                return (int)(a + b);
            case "-":   // if the operator is equal to -
                return (int)(a - b);
            case "*":   // if the operator is equal to *
                return (int)(a * b);
            case "/":   // if the operator is equal to /
                if (b == 0) return 0;    // statement to handle with the division by zero
                return a / b;
            default:   // if the operator is invalid
                throw new IllegalArgumentException("Invalid operator: " + operator);

        }
    }

    // getters and setters
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
}
