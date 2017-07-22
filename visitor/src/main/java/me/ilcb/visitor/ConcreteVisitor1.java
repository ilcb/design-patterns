package me.ilcb.visitor;

/**
 * 具体的访问者1
 */
public class ConcreteVisitor1 implements Visitor {
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println(elementA.getName() + " visitd by ConcerteVisitor1");
    }

    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println(elementB.getName() + " visited by ConcerteVisitor1");
    }
}
