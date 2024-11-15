package com.example.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.support.JdbcRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

@SpringBootApplication
public class AnimalDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnimalDemoApplication.class, args);
	}
}
