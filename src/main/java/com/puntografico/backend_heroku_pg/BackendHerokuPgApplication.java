package com.puntografico.backend_heroku_pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendHerokuPgApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendHerokuPgApplication.class, args);
		System.out.println("Hola! Esto se puede ir a Heroku");
	}

}
