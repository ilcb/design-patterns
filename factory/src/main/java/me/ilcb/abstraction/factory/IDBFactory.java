package me.ilcb.abstraction.factory;

/**
 * 抽象工厂角色，提供了创建多种产品的接口
 */
public interface IDBFactory {
    IUser createUser();
    IDepartment createDepartment();
}
