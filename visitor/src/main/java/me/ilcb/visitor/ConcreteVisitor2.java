package me.ilcb.visitor;

/**
 * 具体的访问者2
 */
public class ConcreteVisitor2 implements Visitor {
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println(elementA.getName() + " visitd by ConcerteVisitor2");
    }

    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println(elementB.getName() + " visited by ConcerteVisitor2");
    }
}

