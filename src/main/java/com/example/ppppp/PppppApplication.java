package com.example.ppppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PppppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PppppApplication.class, args);
	}

}
