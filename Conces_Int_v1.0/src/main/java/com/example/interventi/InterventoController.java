package com.example.interventi;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class InterventoController {
	
	@Autowired
	private InterventoService is;
	
	public InterventoController(InterventoService intervento) {
		this.is = intervento;
	}
	
	
	private Intervento dtoToEntity(InterventoOggetto interventoOggetto) {
		var intervento =new Intervento();
		intervento.setId(interventoOggetto.getId());
		intervento.setEseguito(interventoOggetto.isEseguito());
		intervento.setOfficina(interventoOggetto.getOfficina());
		intervento.setDurata(interventoOggetto.getDurata());
		return intervento;
	}
	
	@PostMapping(path = "inserisciIntervento")
	public Intervento inserisciIntervento(@Valid @RequestBody InterventoOggetto interventoOggetto) {
		var intervento = dtoToEntity(interventoOggetto);
		return is.inserisciIntervento(intervento);
	}
	
	@PostMapping(path="interventoTerminato")
	public void interventoTerminato(idIntervento id) {
		is.interventoTerminato(id);
	}

}
