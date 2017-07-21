package me.ilcb.decorator;

/**
 */
public class ConcreteDecoratorB extends Decorator {
    public void operation(){
        super.operation();
        addOperation();
        System.out.println("具体装饰B");
    }

    public void addOperation(){

    }
}
