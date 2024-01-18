package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
    @Bean
    @Primary
    public B getBean(){
        B b1 = new B();
        return b1;
    }

    @Bean("clist")
    public List<String> getCities(){

        List<String> cities = new ArrayList<String>();

        cities.add("delhi");
        cities.add("chennai");
        cities.add("mumbai");
        cities.add("kolkata");

        return cities;

    }
    @Bean("DOB")
    public LocalDate getDate(){
        return LocalDate.now();
    }
}
