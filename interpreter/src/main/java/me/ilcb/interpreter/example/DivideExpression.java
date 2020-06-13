package me.ilcb.interpreter.example;

/**
 * 除法运算
 */
public class DivideExpression extends OperationExpression {
    public DivideExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }
}
