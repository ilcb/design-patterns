package me.ilcb.abstraction.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {
    @Test
    public void test() {
        IDBFactory factory = new OracleFactory();
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
    }
}