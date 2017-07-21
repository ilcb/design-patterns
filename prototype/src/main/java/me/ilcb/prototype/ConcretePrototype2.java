package me.ilcb.prototype;

/**
 * 具体原型角色
 */
public class ConcretePrototype2 implements Prototype{
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prototype clone() {
        ConcretePrototype2 copyConcretePrototype2 = new ConcretePrototype2();
        copyConcretePrototype2.setName(this.name);
        return copyConcretePrototype2;
    }

    public String toString(){
        return "Now in Prototype2, the name is " + this.getName();
    }
}
