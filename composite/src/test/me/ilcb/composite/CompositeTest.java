package me.ilcb.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {
    @Test
    public void test() {
        Composite root  = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Composite XA"));
        comp.add(new Leaf("Composite XB"));
        root.add(comp);

        Composite comp1 = new Composite("Composite XY");
        comp1.add(new Leaf("Composite XYA"));
        comp1.add(new Leaf("Composite XYB"));
        comp.add(comp1);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}