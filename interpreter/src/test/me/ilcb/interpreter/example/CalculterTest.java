package me.ilcb.interpreter.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculterTest {
    @Test
    public void test() {
        String str = "3+(2-5)*6/3"; // 后缀表达式为： 325-6*3/+
        Calculator calculator = new Calculator();
        calculator.setExpressions(str);
        int result = calculator.calculate();
        System.out.println(result);

        str = "5+2*(3*(3-1*2+1))"; // 523312*-1+**+
        calculator.setExpressions(str);
        result = calculator.calculate();
        System.out.println(result);
    }
}