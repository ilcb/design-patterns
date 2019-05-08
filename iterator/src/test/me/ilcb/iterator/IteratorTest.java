package me.ilcb.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IteratorTest {
    @Test
    public void test() {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        concreteAggregate.setList(list);

        Iterator iterator = concreteAggregate.createIterator();
        Object object = null;
        while (iterator.hasNext()) {
            object = iterator.next();
            System.out.print(object + "  ");
        }
    }
}