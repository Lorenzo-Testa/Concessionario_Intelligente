package com.example.officina;

public class OfficinaOggetto {
private String posizione;
private int carico;



public OfficinaOggetto(String posizione, int carico, int capacitamax) {
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
private int capacitamax;




}
