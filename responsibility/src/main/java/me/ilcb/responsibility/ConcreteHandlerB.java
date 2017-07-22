package me.ilcb.responsibility;

/**
 * Created by Jasper on 2016/5/13.
 */
public class ConcreteHandlerB extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request > 10 && request <= 20){
            System.out.println(this.getClass().getName() + "处理请求:" + request);
        } else if(successor != null){
            successor.handlerRequest(request);
        }
    }
}
