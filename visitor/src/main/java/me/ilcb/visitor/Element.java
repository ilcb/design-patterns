package me.ilcb.visitor;

/**
 */
public interface Element {
    void accept(Visitor visitor);
}
