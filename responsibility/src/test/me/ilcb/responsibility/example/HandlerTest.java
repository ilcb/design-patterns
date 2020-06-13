package me.ilcb.responsibility.example;

import org.junit.Before;
import org.junit.Test;

public class HandlerTest {
    private Handler leader;
    private Handler manager;
    private Handler generalManager;

    @Before
    public void before() {
        leader = new LeaderHandler("leader");
        manager = new ManagerHandler("manager");
        generalManager = new GeneralManagerHandler("generalManager");
    }

    /**
     * 流程1：leader-> manager ->generalManager
     */
    @Test
    public void test1() {
        Request request = new Request("guisu", 4, "休息");
        System.out.println("流程1：leader->manager->generalManager");
        leader.setSuccessor(manager);
        manager.setSuccessor(generalManager);
        leader.handleRequest(request);
    }

    /**
     * 流程2 :
     * leader ->generalManager
     */
    @Test
    public void test2() {
        System.out.println("流程2:leader->generalManager");
        Request request = new Request("guisu", 3, "休息");
        leader.setSuccessor(generalManager);
        leader.handleRequest(request);
    }

    /**
     * 流程3 :如果leader不在，那么完全可以写这样的代码
     * manager ->generalManager
     */
    @Test
    public void test3() {
        System.out.println("流程3:如果leader不在:manager->generalManager");
        Request request = new Request("guisu", 0.1f, "休息");
        leader.setSuccessor(manager);
        manager.setSuccessor(generalManager);
        leader.handleRequest(request);
    }

}