package me.ilcb.bridge;

/**
 *  定义抽象类的接口
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
