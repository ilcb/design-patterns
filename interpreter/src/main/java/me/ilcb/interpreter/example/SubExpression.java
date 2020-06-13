package me.ilcb.interpreter.example;

/**
 * 减法运算
 */
public class SubExpression extends OperationExpression {
    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
