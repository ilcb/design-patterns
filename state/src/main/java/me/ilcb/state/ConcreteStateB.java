package me.ilcb.state;

/**
 * 具体状态
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        State state = new ConcreteStateA();
        context.setState(state);
    }
}
