package com.masai.dummyLayeredApplication;

public class PresentationBean {
    private ServiceBean service;

    public void setService(ServiceBean service) {
        this.service = service;
    }
    public void present(){
        service.calculateInterest();
        System.out.println("presenting the calculated interest in PL");
    }
}
