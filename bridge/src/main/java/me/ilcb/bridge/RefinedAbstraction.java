package me.ilcb.bridge;

/**
 *  扩充由Abstraction定义的接口
 */
public class RefinedAbstraction extends Abstraction{
    public void operation(){
        implementor.operation();
    }
}
