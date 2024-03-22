package com.CompteEntreprise.CompteEntreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private service service;
	
	@PostMapping("/Entreprise")
	public Entreprise save(Entreprise a) {
		return service.save(a);
		
	}
	@GetMapping("/Entreprise/{matriculeFiscaleDeclarante}")
	public Entreprise findbymatricule(@PathVariable("matriculeFiscaleDeclarante") String matriculeFiscaleDeclarante) {
		return service.findBymatricule_fiscale_declarante(matriculeFiscaleDeclarante);
	}
}
