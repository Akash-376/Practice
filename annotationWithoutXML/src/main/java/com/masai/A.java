package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDate;
import java.util.List;

@Service(value = "a1")
public class A {
    @Autowired
    private List<String> cities;
    @Autowired
    private LocalDate dob;

    @Autowired
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
        System.out.println("List is " + cities);
        System.out.println("DOB is " + dob);
    }


}