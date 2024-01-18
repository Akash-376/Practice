package com.masai.couplingDemo;

public class Bike implements Vehicle{
    public void ride(){
        System.out.println("Ride start...");
    }

    @Override
    public void go() {
        ride();
    }
}
