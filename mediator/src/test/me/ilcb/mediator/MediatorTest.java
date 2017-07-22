package me.ilcb.mediator;

import org.junit.Test;

public class MediatorTest {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.send("Hello!");
        colleague2.send("Hi");
    }
}