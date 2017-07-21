package me.ilcb.builder;

/**
 * 抽象建造者类，确定产品由2个部件partA和partB组成，并声明得到一个产品构建结果的方法
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
