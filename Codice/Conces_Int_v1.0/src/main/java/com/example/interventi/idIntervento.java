package com.example.interventi;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

@Embeddable
public class idIntervento implements Serializable{

	
    @JoinColumn(name = "targa",nullable=false)
	private String targaAuto;

    @Column
    private String lavoro;
    
	
	public idIntervento() {}
	
	public idIntervento(String targa,String lavoro) {
		this.targaAuto=targa;
		this.lavoro=lavoro;
	}
	
	public String getTargaAuto() {
		return targaAuto;
	}

	public void setTargaAuto(String targaAuto) {
		this.targaAuto = targaAuto;
	}

	public String getLavoro() {
		return lavoro;
	}

	public void setLavoro(String lavoro) {
		this.lavoro = lavoro;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof idIntervento)) return false;
	        idIntervento that = (idIntervento) o;
	        return Objects.equals(getTargaAuto(), that.getTargaAuto()) && Objects.equals(getLavoro() , that.getLavoro());
	    }
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(getTargaAuto(), getLavoro());
	    }

}
