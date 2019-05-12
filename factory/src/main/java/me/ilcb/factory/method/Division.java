package me.ilcb.factory.method;

/**
 * 除法（具体产品角色）
 */
public class Division implements IOperation{
    public double calculate(double num1, double num2) {
        return num1 != 0 ? num1 / num2 : Double.MIN_VALUE;
    }
}
