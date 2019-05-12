package me.ilcb.decorator;

/**
 * 具体装饰者
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
