package me.ilcb.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {
    @Test
    public void test() {
        Element elementA = new ConcreteElementA("ElementA");
        Element elementB = new ConcreteElementB("ElementB");
        Element elementA2 = new ConcreteElementB("ElementA2");

        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(elementA);
        objectStructure.attach(elementB);
        objectStructure.attach(elementA2);
        objectStructure.detach(elementA);

        objectStructure.accept(visitor1);
        objectStructure.accept(visitor2);
    }
}