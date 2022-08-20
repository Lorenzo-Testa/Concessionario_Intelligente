package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.accountManager.*;
import com.example.autoManager.*;
import com.example.interventi.*;
import com.example.officina.*;


@SpringBootApplication
public class ConcesIntApplication implements CommandLineRunner{
	

	@Autowired
	InterventoController ic;
	@Autowired
	AutoController ac;
	@Autowired
	UtenteController uc;
	@Autowired
	OfficinaController oc;
	
	public static void main(String[] args) {
		SpringApplication.run(ConcesIntApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AutoOggetto auto=new AutoOggetto("targa3","234456","concessionaria","Fiat","Panda","Milano");
		ac.inserisciAuto(auto);
		idIntervento id=new idIntervento("targa4","lavoro");
		InterventoOggetto a= new InterventoOggetto(id,false,"MILANO",100);
		ic.inserisciIntervento(a);
		
		//OfficinaOggetto oo= new OfficinaOggetto("Bergamo",5,6);
		
		
		
	}
	
	
	

}
