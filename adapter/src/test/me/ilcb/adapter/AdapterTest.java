package me.ilcb.adapter;

import me.ilcb.adapter.object.Adapter;
import me.ilcb.adapter.object.Target;
import org.junit.Test;


public class AdapterTest {
    @Test
    public void test() {
        Target target = new Adapter();
        target.request();
    }
}