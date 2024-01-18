package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {
    @Autowired
    private Environment env;
//    @Value("${db.driverName}")
    private String dname;
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String uname;
    @Value("${db.password}")
    private String pass;

    public void funA() {
        System.out.println("inside funA of A");
        System.out.println("Driver name  is "+ env.getProperty("db.driverName"));
        System.out.println("Connection URL  is "+url);
        System.out.println("Username  is "+uname);
        System.out.println("Password  is "+pass);

    }
}
