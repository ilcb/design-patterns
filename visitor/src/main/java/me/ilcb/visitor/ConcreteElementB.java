package me.ilcb.visitor;

/**
 * 具体元素B
 */
public class ConcreteElementB implements Element {
    private String name;

    public ConcreteElementB(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    /**
     * 接受访问者调用它针对该元素的新方法
     *
     * @paramVisitor$visitor
     */
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
