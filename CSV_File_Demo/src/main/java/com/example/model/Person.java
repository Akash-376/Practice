package com.example.model;

import com.opencsv.bean.CsvBindByName;

public class Person {

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Age")
    private int age;

    @CsvBindByName(column = "Location")
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
