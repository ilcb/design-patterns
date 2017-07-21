package me.ilcb.abstraction.factory;

public class InformixFactory implements IDBFactory {
    public IUser createUser() {
        return new InformixUser();
    }

    public IDepartment createDepartment() {
        return new InformixDepartment();
    }
}
