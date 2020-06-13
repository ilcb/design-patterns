package me.ilcb.visitor.example;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void test() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        System.out.println("=======================");
        ComputerPart keyboard = new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());

        System.out.println("=======================");
        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

        System.out.println("=======================");
        ComputerPart monitor = new Monitor();
        monitor.accept(new ComputerPartDisplayVisitor());
    }
}
