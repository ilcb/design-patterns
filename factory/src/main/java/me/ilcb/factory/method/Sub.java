package me.ilcb.factory.method;

/**
 * 减法（具体产品角色）
 */
public class Sub implements IOperation {
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
