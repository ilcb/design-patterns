package me.ilcb.interpreter.example;

/**
 * 操作数表达式
 */
public class NumExpression extends Expression {
    private Integer num;

    public NumExpression(Integer num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
