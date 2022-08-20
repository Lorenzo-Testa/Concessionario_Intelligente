package com.example.interventi;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Intervento {
	

	@EmbeddedId
	private idIntervento id;
	
	@Column
	private int durata;
	
	@Column
	private boolean eseguito ;
	
	@JoinColumn(name="posizione",nullable=false)
	@Column
	private String officina;
	
	public Intervento() {}
	
	public Intervento(idIntervento id, int durata, boolean eseguito, String officina) {
		super();
		this.id = id;
		this.durata = durata;
		this.eseguito = eseguito;
		this.officina = officina;
	}
	
	
	public String getOfficina() {
		return officina;
	}

	public void setOfficina(String officina) {
		this.officina = officina;
	}
	
	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}


	public idIntervento getId() {
		return id;
	}

	public void setId(idIntervento id) {
		this.id = id;
	}

	public boolean isEseguito() {
		return eseguito;
	}

	public void setEseguito(boolean eseguito) {
		this.eseguito = eseguito;
	}

}
