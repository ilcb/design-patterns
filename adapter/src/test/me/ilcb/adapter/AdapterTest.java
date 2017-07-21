package me.ilcb.adapter;

import org.junit.Test;

import static org.junit.Assert.*;


public class AdapterTest {
    @Test
    public void test() {
        Target target = new Adapter();
        target.request();
    }
}