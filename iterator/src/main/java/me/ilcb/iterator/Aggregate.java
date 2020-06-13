package me.ilcb.iterator;

/**
 * 聚合定义创建相应迭代器对象的接口
 */
public interface Aggregate {
    Iterator createIterator();
}
