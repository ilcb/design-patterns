package me.ilcb.visitor.example;

/**
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}