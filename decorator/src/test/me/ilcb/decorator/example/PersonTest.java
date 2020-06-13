package me.ilcb.decorator.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void test() {
        ConcreratePerson person = new ConcreratePerson();
        TShirts tShirts = new TShirts();
        BigTrouser trouser = new BigTrouser();
        Sneakers shoes = new Sneakers();

        tShirts.decorate(person);
        trouser.decorate(tShirts);
        shoes.decorate(trouser);

        shoes.show();
    }
}