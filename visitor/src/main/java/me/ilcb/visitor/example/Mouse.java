package me.ilcb.visitor.example;

/**
 */
public class Mouse implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}