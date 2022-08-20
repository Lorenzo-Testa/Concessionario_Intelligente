package com.example.officina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class OfficinaController {
	
	@Autowired
	OfficinaService officinaservice;
	
	public OfficinaController(OfficinaService os) {
		officinaservice=os;
	}
	
	private Officina dtoToEntity(OfficinaOggetto officinaoggetto) {
		Officina o=new Officina();
		o.setPosizione(officinaoggetto.getPosizione());
		o.setCarico(officinaoggetto.getCarico());
		o.setCapacitamax(officinaoggetto.getCapacitamax());
		return o;
	}

}
