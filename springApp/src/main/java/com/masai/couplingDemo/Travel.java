package com.masai.couplingDemo;

public class Travel {
//    Car c = new Car();

    private Vehicle v;
    private int numberOFPerson;

    public void setV(Vehicle v) {
        this.v = v;
    }

    public void setNumberOFPerson(int numberOFPerson) {
        this.numberOFPerson = numberOFPerson;
    }
    //    public Travel(Vehicle v, int numberOFPerson) {
//        this.v = v;
//        this.numberOFPerson = numberOFPerson;
//    }


    public void journey(){
//        v.go();
        System.out.println(v);
        System.out.println("Journey started");
        System.out.println("number of preson " + numberOFPerson);
    }
}
