package com.example.autoManager;



public class AutoOggetto {
	
	private String targa;
	private String telaio;
	private String proprietario;
	private String marca;
	private String modello;
	private String dataconsegna;
	private String datavendita;
	private boolean venduta;
	private Stato stato;
	private String concprovenienza;
	private String conclavorazione;
	private String arrivo;
	
	
	public AutoOggetto(String targa,String telaio,String p,String marca,String modello,String conc) 
	{
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
		this.arrivo=null;
		
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
	public void setConclavorazione(String conclavorazione) {
		this.conclavorazione = conclavorazione;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}

	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}

}
