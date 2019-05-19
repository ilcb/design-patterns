package me.ilcb.state.example;

/**
 * 电梯运行状态
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("lift run");
    }

    @Override
    public void stop() {
        this.context.setLiftState(new ClosingState());
        this.context.getLiftState().stop();
    }
}
