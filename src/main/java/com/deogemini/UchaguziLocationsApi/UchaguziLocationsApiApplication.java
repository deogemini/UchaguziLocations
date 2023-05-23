package com.deogemini.UchaguziLocationsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class UchaguziLocationsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UchaguziLocationsApiApplication.class, args);
	}

}
