package me.ilcb.responsibility;

/**
 * Created by Jasper on 2016/5/13.
 */
public class ConcreteHandlerC extends Handler {

    @Override
    public void handlerRequest(int request) {
        if (request > 20 && request <= 30){
            System.out.println(this.getClass().getName() + "处理请求:" + request);
        } else if(successor != null){
            successor.handlerRequest(request);
        }
    }
}
