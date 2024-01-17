package com.example.AutowiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.resources.SpringConfig;

public class App {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    Student st = (Student) ctx.getBean(Student.class);
    
    st.display();
  }
}
