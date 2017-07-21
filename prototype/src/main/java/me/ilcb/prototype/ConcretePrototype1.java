package me.ilcb.prototype;

/**
 * 具体原型角色
 */
public class ConcretePrototype1 implements Prototype {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prototype clone() {
        ConcretePrototype1 copyConcretePrototype1 = new ConcretePrototype1();
        copyConcretePrototype1.setName(this.name);
        return copyConcretePrototype1;
    }

    public String toString(){
        return "Now in Prototype1, the name is " + this.getName();
    }
}
