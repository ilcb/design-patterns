package me.ilcb.decorator;

/**
 * 具体装饰者
 */
public class ConcreteDecoratorA extends Decorator {
    private String addState; //标识区分其他ConcreteDecorator

    public void operation(){
        super.operation();
        addState = "new State";
        System.out.println("具体装饰A");
    }
}
