package com.example.interventi;

public class InterventoOggetto {
	

	private idIntervento id;
	private boolean eseguito;
	private String officina;
	private int durata;


	public InterventoOggetto(idIntervento id, boolean eseguito,String posizione,int durata) {
		super();
		this.id=id;
		this.eseguito = eseguito;
		this.officina=posizione;
		this.durata=durata;
	}
	
	
	public idIntervento getId() {
		return id;
	}

	public void setId(idIntervento id) {
		this.id = id;
	}
	
	public String getOfficina() {
		return officina;
	}


	public void setOfficina(String officina) {
		this.officina = officina;
	}

	public boolean isEseguito() {
		return eseguito;
	}

	public void setEseguito(boolean eseguito) {
		this.eseguito = eseguito;
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}

}
