package me.ilcb.interpreter.example;

/**
 * 运算表达式
 */
public abstract class OperationExpression extends Expression {
    protected Expression leftExpression;
    protected Expression rightExpression;

    public OperationExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
