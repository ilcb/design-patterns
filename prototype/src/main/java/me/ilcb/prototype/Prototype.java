package me.ilcb.prototype;

/**
 * 抽象原型角色
 */
public interface Prototype {
    public Prototype clone();
    public void setName(String name);
    public String getName();
}
