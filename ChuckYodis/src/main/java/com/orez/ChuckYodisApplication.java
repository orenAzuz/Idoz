package com.orez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class ChuckYodisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckYodisApplication.class, args);
	}

}
