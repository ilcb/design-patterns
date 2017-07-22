package me.ilcb.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题/抽象通知者
 */
public abstract class Subject {
    public List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void giveNotify(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
