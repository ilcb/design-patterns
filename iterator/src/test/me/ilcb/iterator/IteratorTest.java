package me.ilcb.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {
    @Test
    public void test() {
        Aggregate ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        Iterator it = ag.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}