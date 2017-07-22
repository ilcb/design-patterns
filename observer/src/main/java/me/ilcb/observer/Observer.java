package me.ilcb.observer;

/**
 * 抽象观察者，位所有的抽象观察对象提供接口，在收到主题的通知时更新自己
 */
public abstract class Observer {
    public abstract void update();
}
