package me.ilcb.interpreter.example;

/**
 * 加法运算
 */
public class AddExpression extends OperationExpression {
    public AddExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
