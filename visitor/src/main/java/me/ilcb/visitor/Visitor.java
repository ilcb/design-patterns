package me.ilcb.visitor;

/**
 * 访问者接口
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA elementA);

    void visitConcreteElementB(ConcreteElementB elementB);
}
