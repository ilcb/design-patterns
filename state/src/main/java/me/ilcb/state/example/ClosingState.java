package me.ilcb.state.example;

/**
 * 电梯门关闭以后，电梯可以做哪些事情
 */
public class ClosingState extends LiftState {
    public void close() {
        System.out.println("lift close");
    }

    public void open() {
        this.context.setLiftState(new OpenningState());
        this.context.getLiftState().open();
    }

    public void run() {
        this.context.setLiftState(new RunningState());
        this.context.getLiftState().run();
    }

    public void stop() {
        this.context.setLiftState(new StoppingState());
        this.context.getLiftState().stop();
    }
}
