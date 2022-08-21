package com.example.accountManager;

public class UtenteOggetto {
	  private String nome;
	  private String cognome;
	  private String cf;
	  private String email;
	  private String password;
	  private Mansione m;
	  

	public UtenteOggetto(String nome, String cognome, String cf, String email, String password,Mansione m) {
		  this.nome = nome;
		  this.cognome = cognome;
		  this.cf = cf;
		  this.email = email;
		  this.password = password;
		  this.m=m;
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
	  
	  public Mansione getM() {
		return m;
	}


	public void setM(Mansione m) {
		this.m = m;
	}


	  

	}