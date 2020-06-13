package me.ilcb.proxy.example;

/**
 */
public class Persuit implements SendGift {
    SchoolGirl girl;

    public Persuit(SchoolGirl girl){
        this.girl = girl;
    }

    public void sendFlowers() {
        System.out.println(girl.getName() + "送你花!");
    }

    public void sendChocolate() {
        System.out.println(girl.getName() + "送你巧克力!");
    }
}
