package com.CompteEntreprise.CompteEntreprise;

import org.springframework.data.jpa.repository.JpaRepository;



public interface intrepo extends JpaRepository<Entreprise,String > {
	Entreprise findByMatriculeFiscaleDeclarante(String a);

}
