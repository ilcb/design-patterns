package me.ilcb.interpreter.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTest {
    @Test
    public void test() {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constants c = new Constants(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }

}