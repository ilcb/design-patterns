package me.ilcb.interpreter.prototype;

/**
 * 非终结符表达式，为文法中非终结符实现解释操作
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终结解释器");
    }
}
