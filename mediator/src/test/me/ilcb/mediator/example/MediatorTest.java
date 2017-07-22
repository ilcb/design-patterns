package me.ilcb.mediator.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediatorTest {
    @Test
    public void test() {
        UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();

        USA usa = new USA(securityCouncil);
        Iraq iraq = new Iraq(securityCouncil);

        securityCouncil.setColleague1(usa);
        securityCouncil.setColleague2(iraq);

        usa.declare("不准研制核武器，不然我要发飙了!");
        iraq.declare("我们没有核武器，我们有石油!");

    }
}