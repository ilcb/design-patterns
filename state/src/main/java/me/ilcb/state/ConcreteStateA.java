package me.ilcb.state;

/**
 * 具体状态
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        State state = new ConcreteStateB();
        context.setState(state);
    }
}
