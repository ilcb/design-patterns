package me.ilcb.responsibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class HandlerTest {
    @Test
    public void test() {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] reuqests = new int[]{2, 5, 14, 22, 28};

        for (int request : reuqests){
            handlerA.handlerRequest(request);
        }
    }
}