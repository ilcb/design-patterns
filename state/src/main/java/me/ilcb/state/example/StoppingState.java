package me.ilcb.state.example;

/**
 */
public class StoppingState extends LiftState {
    public void close() {
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
        System.out.println("lift stop");
    }
}


