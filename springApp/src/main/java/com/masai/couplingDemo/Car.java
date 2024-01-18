package com.masai.couplingDemo;

//dependency class
public class Car implements Vehicle{
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void go() {
        start();
        System.out.println();
    }
}
