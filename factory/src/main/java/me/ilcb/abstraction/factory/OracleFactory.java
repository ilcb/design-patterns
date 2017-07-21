package me.ilcb.abstraction.factory;

public class OracleFactory implements IDBFactory {
    public IUser createUser() {
        return new OracleUser();
    }

    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
