package me.ilcb.visitor;

/**
 * 抽象元素
 */
public interface Element {
    void accept(Visitor visitor);
}
