package com.example.officina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Officina {
	
	@Id
	private String posizione;
	
	@Column(nullable = false)
	private int carico;
	
	@Column(nullable = false)
	private int capacitamax;
	
	public Officina() {
	}
	
	public Officina(String posizione, int carico, int capacitamax) {
		super();
		this.posizione = posizione;
		this.carico = carico;
		this.capacitamax = capacitamax;
	}
	

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public int getCarico() {
		return carico;
	}

	public void setCarico(int carico) {
		this.carico = carico;
	}

	public int getCapacitamax() {
		return capacitamax;
	}

	public void setCapacitamax(int capacitamax) {
		this.capacitamax = capacitamax;
	}



}
