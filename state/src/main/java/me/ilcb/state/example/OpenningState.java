package me.ilcb.state.example;

/**
 * 在电梯门开启的状态下能做什么事情
 */
public class OpenningState extends LiftState {

    public void close() {
        this.context.setLiftState(new ClosingState());
        this.context.getLiftState().close();
    }

    public void open() {
        System.out.println("lift open");
    }

    public void run() {
    }

    public void stop() {
    }
}
