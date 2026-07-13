package com.cognizant.spring_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);

		displayDate();

		Country country = getCountry();
		System.out.println(country.getCode());
		System.out.println(country.getName());
	}

	public static void displayDate() {

		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse("31/12/2018");
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Country getCountry() {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		return country;
	}
}