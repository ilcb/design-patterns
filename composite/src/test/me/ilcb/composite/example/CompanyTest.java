package me.ilcb.composite.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {
    @Test
    public void test() {
        ConcreteCompany root = new ConcreteCompany("总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company = new ConcreteCompany("华东总公司");
        company.add(new HRDepartment("华东公司人力资源部"));
        company.add(new FinanceDepartment("华东公司财务部"));
        root.add(company);

        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财务部"));
        company.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州办事处");
        company2.add(new HRDepartment("杭州办事处人力资源部"));
        company2.add(new FinanceDepartment("杭州办事处财务部"));
        company.add(company2);

        System.out.println("===============结构图===============");
        root.display(1);;

        System.out.println("===============职能===============");
        root.lineOfDuty();
    }
}