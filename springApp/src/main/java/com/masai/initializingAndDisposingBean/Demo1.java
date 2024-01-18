package com.masai.initializingAndDisposingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AA a =  ctx.getBean("a1", AA.class);

        a.funA();

        ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx; // because close method is not available in ApplicationContext;
        ctx2.close();

    }
}
