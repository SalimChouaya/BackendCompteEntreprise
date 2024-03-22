package com.CompteEntreprise.CompteEntreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service implements intservice {
  @Autowired
	private intrepo intrepo;
  
	public Entreprise save(Entreprise a) {
		return intrepo.save(a);
		
	}

	
	public Entreprise findBymatricule_fiscale_declarante(String a) {
	
	 return intrepo.findByMatriculeFiscaleDeclarante(a);
	}

}
