package com.CompteEntreprise.CompteEntreprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("com.CompteEntreprise.CompteEntreprise")
@SpringBootApplication
public class CompteEntrepriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteEntrepriseApplication.class, args);
	}

}
