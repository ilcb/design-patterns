package me.ilcb.interpreter.example;

/**
 * 乘法运算
 */
public class MultipleExpression extends OperationExpression {
    public MultipleExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}
