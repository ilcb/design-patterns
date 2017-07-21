package me.ilcb.factory.method;


public class Division implements IOperation{
    public double calculate(double num1, double num2) {
        return num1 != 0 ? num1 / num2 : Double.MIN_VALUE;
    }
}
