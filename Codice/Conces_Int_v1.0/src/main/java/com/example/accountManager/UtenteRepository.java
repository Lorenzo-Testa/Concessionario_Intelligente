package com.example.accountManager;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, String>{
	
	List<Utente> findAllByMansione(Mansione m);
	
	List<Utente> findAllByNome(String n);
	
}

