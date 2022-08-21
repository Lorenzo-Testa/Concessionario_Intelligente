package com.example.accountManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UtenteService{
	

	@Autowired
	private UtenteRepository utenteRepository;

	
	public UtenteService(UtenteRepository utente) {
		this.utenteRepository = utente;
	}

	//public List<Utente> getUtente() {
		//return utenteRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	//}

	
	public List<Utente> findByMansione(Mansione m) {
		List<Utente> u = utenteRepository.findAllByMansione(m);
		return u;
	}
	
	public List<Utente> findAllByNome(String n){
		List<Utente> u = utenteRepository.findAllByNome(n);
		return u;
	}
	
	public void changePassword(String cf,String vp,String np)
	{
		Optional<Utente> u=utenteRepository.findById(cf);
		if (!u.isPresent()) new ResponseStatusException(HttpStatus.NOT_FOUND, "l'utente non esiste");
		if(u.get().getPassword()==vp)
			{
			u.get().setPassword(np);
			utenteRepository.save(u.get());
			}
		else new Exception("la password inserita non è quella attuale");
		
	}

	
	public Utente inserisciUtente(Utente nuovoUtente) {
		return utenteRepository.save(nuovoUtente);
	}

	public Utente login(Utente logginUtente) {
		return null;
	}

	public void logout(Utente logginOutUtente) {
	}

	public void deleteUtente(String cf) {
		Optional<Utente> utenteDelete = utenteRepository.findById(cf);

		if (!utenteDelete.isPresent())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No utente da eliminare");

		utenteRepository.deleteById(cf);
	}

}