package me.ilcb.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {
    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("A", subject));
        subject.attach(new ConcreteObserver("B", subject));
        subject.attach(new ConcreteObserver("C", subject));

        subject.subjectState = "OMG";
        subject.giveNotify();
    }

}