package com.masai;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

//        Employee emp = new Employee();
//        emp.setName("Akash");

        SalariedEmployee semp = new SalariedEmployee();
        semp.setName("Mohan");
        semp.setSalary(85000);

        ContractualEmployee cemp = new ContractualEmployee();
        cemp.setName("Hari");
        cemp.setNoOfWorkingDays(10);
        cemp.setCostPerDay(3000);

        em.getTransaction().begin();
//        em.persist(emp);
        em.persist(semp);
        em.persist(cemp);
        em.getTransaction().commit();

        System.out.println("Done");
    }

}
