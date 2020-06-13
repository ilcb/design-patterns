package me.ilcb.bridge;

/**
 * 实现Implementor接口并定义它的具体实现
 */
public class ConcreteImplementorB extends Implementor{
    @Override
    public void operation() {
        System.out.println("具体实现B");
    }
}
