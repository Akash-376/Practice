package com.example;

import com.example.model.Person;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CsvFileDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CsvFileDemoApplication.class, args);

		CSVReader reader = new CSVReader(new FileReader("example.csv"));

		CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
				.withType(Person.class)
				.build();

		List<Person> people = csvToBean.parse();
		// print the parsed data
		for(Person person : people){
			System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Location: " + person.getLocation());
		}
	}

}
