package me.ilcb.decorator;

/**
 */
public class ConcreteDecoratorA extends Decorator {
    private String addState; //标识区分其他ConcreteDecorator

    public void operation(){
        super.operation();
        addState = "new State";
        System.out.println("具体装饰A");
    }
}
