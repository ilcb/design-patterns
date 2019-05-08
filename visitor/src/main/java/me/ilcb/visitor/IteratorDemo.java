package me.ilcb.visitor;

import java.util.Iterator;

public class IteratorDemo implements Iterable<String> {
    private String[] array = {"hello", "world"};
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public String next() {
                return array[index++];
            }
        };
    }

    public static void main(String[] args) {
        IteratorDemo demo = new IteratorDemo();

        for  (String str : demo.array) {
            System.out.println(str);
        }
    }
}
