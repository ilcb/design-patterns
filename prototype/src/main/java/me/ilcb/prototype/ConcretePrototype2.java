package me.ilcb.prototype;

/**
 * 具体原型角色
 */
public class ConcretePrototype2 implements Prototype{
    private String name;

    public ConcretePrototype2(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new ConcretePrototype2(name);
    }

    public String toString(){
        return "Now in Prototype2, the name is " + name;
    }
}
