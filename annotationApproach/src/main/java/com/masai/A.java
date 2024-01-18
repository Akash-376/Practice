package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service(value = "a1")
public class A {
    @Autowired(required = false)
    @Qualifier("b")
    private B b1;

    @PostConstruct
    public void setUp() {
        System.out.println("inside set up method");
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("inside tear down method");
    }

    public void funA() {
        System.out.println("inside funA of com.masai.A");
        System.out.println("B obj is :" + b1);
    }

}