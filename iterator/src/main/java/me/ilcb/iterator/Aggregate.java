package me.ilcb.iterator;

/**
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator();
}