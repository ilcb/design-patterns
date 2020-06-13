package me.ilcb.iterator;

import java.util.List;

/**
 * 迭代器实现
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}