package com.example.interventi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;



@Service
public class InterventoService {
	
	@Autowired
	private InterventoRepository ir;

	
	public InterventoService(InterventoRepository intervento) {
		this.ir = intervento;
	}

	public Intervento inserisciIntervento(Intervento  nuovoIntervento) {
		return ir.save(nuovoIntervento);
	}

	public void interventoTerminato(idIntervento id) {
		Optional<Intervento> i =ir.findById(id);
		if(i.isEmpty())throw new ResponseStatusException(HttpStatus.NOT_FOUND, "l'intervento non esiste");
		if(i.get().isEseguito()) new Exception("l'intervento è già terminato");
		i.get().setEseguito(true);
		ir.save(i.get());
	}


}
