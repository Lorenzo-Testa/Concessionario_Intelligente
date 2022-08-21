package com.example.accountManager;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtenteController {

	@Autowired
	private UtenteService utenteService;

	public UtenteController(UtenteService utente) {
		this.utenteService = utente;
	}

	private Utente dtoToEntity(UtenteOggetto utenteOggetto) {
		var utente = new Utente();
		utente.setNome(utenteOggetto.getNome());
		utente.setCognome(utenteOggetto.getCognome());
		utente.setCF(utenteOggetto.getCF());
		utente.setEmail(utenteOggetto.getEmail().toLowerCase());
		utente.setPassword(utenteOggetto.getPassword());
		utente.setMansione(utenteOggetto.getM());
		return utente;
	}

	/** 
	 * Esegue la chiamata post al database per il salvataggio di un nuovo utente, passatogli come parametro
	 * @param utenteOggetto
	 * @return
	 */
	@PostMapping(path = "inserisciUtente")
	public Utente inserisciUtente(@Valid @RequestBody UtenteOggetto utenteOggetto) {
		var utente = dtoToEntity(utenteOggetto);
		return utenteService.inserisciUtente(utente);
	}
	
	/** 
	 * Esegue la chiamata delete al database per cancellare un utente in base all'id passato come parametro
	 * @param cf
	 */
	@DeleteMapping(path = "{utenteId}")
	public void deleteUtente(@PathVariable("utenteId") String cf) {
		utenteService.deleteUtente(cf);
	}
	
	//TODO inserisci, delete, visualizza utenti all, in base al cf, in base alla mansione
	 
	@GetMapping(path="findByMansione")
	public List<Utente> findByMansione(Mansione m){
		List<Utente> u=utenteService.findByMansione(m);
		return u;
	}
	
	@GetMapping(path="findAllByNome")
	public List<Utente> findAllByNome(String n){
		List<Utente> u=utenteService.findAllByNome(n);
		return u;
		
	}
	
	@PostMapping(path = "changePassword")
	public void changePassword(String cf,String vp,String np) {
		utenteService.changePassword(cf,vp,np);
	}

		
	
	
	@PostMapping(path = "login")
	public void login() {
		//TODO
	}

	@PostMapping(path = "logout")
	public void logout() {
		//TODO
	}


}