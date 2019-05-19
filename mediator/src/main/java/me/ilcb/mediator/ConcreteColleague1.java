package me.ilcb.mediator;

/**
 * 具体同事类
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println(getClass().getSimpleName() + "得到消息:" + message);
    }
}
