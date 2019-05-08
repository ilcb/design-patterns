package me.ilcb.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合实现创建相应迭代器的接口，该操作返回ConcreteIterator的一个适当的实例
 */
public class ConcreteAggregate<T> implements Aggregate {
    private List<T> list = new ArrayList<>();

    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
