package me.ilcb.proxy.example;

/**
 */
public class Proxy implements SendGift {
    private Persuit persuit;

    public Proxy(SchoolGirl girl){
        persuit = new Persuit(girl);
    }
    public void sendFlowers() {
        persuit.sendFlowers();
    }

    public void sendChocolate() {
        persuit.sendChocolate();
    }
}
