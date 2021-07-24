package com.example.demo;

import com.example.demo.model.Principal;
import com.example.demo.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopApplication.class, args);

		Teacher teacher1 = new Teacher("Lizzy", "George", "1234",
				"123456789", "Teaching");
		Principal principal = new Principal("Grace", "Smith", "4321",
				"987654321", "Management");

		System.out.println(teacher1.toString());
		System.out.println(principal.toString());
	}

}
