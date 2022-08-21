package com.example.autoManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Auto {
	
	@Id 
	private String targa;

	@Column(nullable = false)
	private String telaio;
	
	@Column(nullable = false)
	private String proprietario;

	@Column(nullable = false)
	private String marca;

	@Column(nullable = false)
	private String modello;
	
	@Column(nullable = true)
	private String dataconsegna;
	
	@Column(nullable = true)
	private String datavendita;
	
	@Column(nullable = false)
	private boolean venduta;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Stato stato;

	@Column(nullable = false)
	private String concprovenienza;
	
	@Column(nullable = true)
	private String conclavorazione;
	
	@Column(nullable = true)
	private String concarrivo;
	
	Auto(){}
	
	public Auto(String targa,String telaio,String p,String marca,String modello,String conc) 
	{
		super();
		this.targa=targa;
		this.telaio=telaio;
		this.proprietario=p;
		this.marca=marca;
		this.modello=modello;
		this.dataconsegna=null;
		this.datavendita=null;
		this.venduta=false;
		this.stato=Stato.ATTESA;
		this.concprovenienza=conc;
		this.conclavorazione=null;
		this.concarrivo=null;
		
	}

	

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDataconsegna() {
		return dataconsegna;
	}

	public void setDataconsegna(String dataconsegna) {
		this.dataconsegna = dataconsegna;
	}

	public String getDatavendita() {
		return datavendita;
	}

	public void setDatavendita(String datavendita) {
		this.datavendita = datavendita;
	}

	public boolean isVenduta() {
		return venduta;
	}

	public void setVenduta(boolean venduta) {
		this.venduta = venduta;
	}

	public String getConcprovenienza() {
		return concprovenienza;
	}

	public void setConcprovenienza(String concprovenienza) {
		this.concprovenienza = concprovenienza;
	}

	public String getConclavorazione() {
		return conclavorazione;
	}

	public void setConclavorazione(String conxlavorazione) {
		this.conclavorazione = conxlavorazione;
	}

	public String getConcarrivo() {
		return concarrivo;
	}

	public void setConcarrivo(String arrivo) {
		this.concarrivo = arrivo;
	}
	
	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

}
