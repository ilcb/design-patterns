package me.ilcb.state;

/**
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        State state = new ConcreteStateA();
        context.setState(state);
    }
}
