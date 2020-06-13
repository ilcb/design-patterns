package me.ilcb.prototype;

/**
 * 具体原型角色
 */
public class ConcretePrototype1 implements Prototype {
    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new ConcretePrototype1(name);
    }

    public String toString(){
        return "Now in Prototype1, the name is " + this.name;
    }
}
