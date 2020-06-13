package me.ilcb.abstraction.factory;

/**
 * 具体工厂类，实现多种具体对象的创建
 */
public class InformixFactory implements IDBFactory {
    public IUser createUser() {
        return new InformixUser();
    }

    public IDepartment createDepartment() {
        return new InformixDepartment();
    }
}
