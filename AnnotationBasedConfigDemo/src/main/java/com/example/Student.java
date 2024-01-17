package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	
	private int rollno;
	
	public String getName() {
		return name;
	}
	@Value("akash")
	public void setName(String name) {
		this.name = name;
		
	}
	public int getRollno() {
		return rollno;
	}
	@Value("21")
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("name: " + name);
		System.out.println("roll no: " + rollno);
	}
	
}
