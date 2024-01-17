package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
//    System.out.println("Hello World!");
	  
	  String resourceFile = "/com/example/resources/applicationContext.xml";
	  ApplicationContext ctx = new ClassPathXmlApplicationContext(resourceFile);
	  
	  Student st = (Student) ctx.getBean("student");
	  
	  st.display();
  }
}
