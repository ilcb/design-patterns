package me.ilcb.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {
    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserver("A", subject));
        subject.registerObserver(new ConcreteObserver("B", subject));
        subject.registerObserver(new ConcreteObserver("C", subject));

        subject.subjectState = "OMG";
        subject.notifyObservers();
    }

}