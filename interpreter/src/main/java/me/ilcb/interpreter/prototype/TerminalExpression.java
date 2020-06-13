package me.ilcb.interpreter.prototype;

/**
 * 终结符表达式，实现与文法中的终结符相关的解释操作
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("总结表达式");
    }
}
