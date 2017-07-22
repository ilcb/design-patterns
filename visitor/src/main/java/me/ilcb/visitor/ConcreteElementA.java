package me.ilcb.visitor;

/**
 * 具体元素A
 */
public class ConcreteElementA implements Element {
    private String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return this.getName();
    }

    //接受访问者调用它针对该元素的新方法
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
