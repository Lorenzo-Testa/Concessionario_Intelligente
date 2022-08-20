package com.example.accountManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Utente {
		
	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;
	
	private @Id String cf;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Mansione mansione;
	

	Utente() {
	}

	public Utente(String nome, String cognome, String cf, String email,String password,Mansione mansione) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.email = email;
		this.password = password;
		this.mansione=mansione;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getCF() {
		return cf;
	}

	public void setCF(String cf) {
		this.cf = cf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Mansione getMansione() {
		return mansione;
	}

	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}
	
}
