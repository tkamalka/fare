package com.cg.fare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class FareApplication {

	public static void main(String[] args) {
		SpringApplication.run(FareApplication.class, args);
	}

}
