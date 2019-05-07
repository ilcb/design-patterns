package me.ilcb.adapter.object;

import me.ilcb.adapter.clazz.Adaptee;

/**
 *  适配器
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    public void request(){
        adaptee.specialRequest(); //把表面上调用Target.request()变成实质上调用adaptee.specialRequest()
    }
}
