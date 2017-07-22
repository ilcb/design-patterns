package me.ilcb.state;

/**
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        State state = new ConcreteStateB();
        context.setState(state);
    }
}
