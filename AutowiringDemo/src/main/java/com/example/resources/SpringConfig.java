package com.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.AutowiringDemo.Address;
import com.example.AutowiringDemo.Student;

@Configuration
public class SpringConfig {
	@Bean
	public Address createAddress() {
		Address addr = new Address();
		
		addr.setHno(135);
		addr.setCity("Delhi");
		addr.setPincode("122017");
		
		return addr;
	}
	@Bean
	public Student createStudent() {
		Student st = new Student();
		st.setName("aknur");
		st.setRollno(111);
		
		return st;
	}
}
