package me.ilcb.fecade;

/**
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("-----方法组A-----");
        subSystemOne.methodOne();
        subSystemFour.methodFour();
    }

    public void methodB(){
        System.out.println("-----方法组B-----");
        subSystemThree.methodThree();
    }
}
