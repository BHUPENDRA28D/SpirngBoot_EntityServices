package com.example.SpringBootEntityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringBootEntityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEntityServiceApplication.class, args);
	}

}
