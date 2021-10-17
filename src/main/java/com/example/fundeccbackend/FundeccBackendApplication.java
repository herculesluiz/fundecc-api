package com.example.fundeccbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class FundeccBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundeccBackendApplication.class, args);

		
	}
	
}
