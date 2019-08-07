package com.womack.upperdeck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class UpperDeckApplication {

	@Bean
	public Function<String, String> uppercase() {
		return s -> s.toUpperCase().concat("... and also, GO BLUES!");
	}

	public static void main(String[] args) {
		SpringApplication.run(UpperDeckApplication.class, args);
	}

}
