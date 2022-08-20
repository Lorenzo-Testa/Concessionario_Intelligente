package com.example.autoManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AutoService{
	

	@Autowired
	private AutoRepository ar;

	
	public AutoService(AutoRepository auto) {
		this.ar = auto;
	}


	
	public Auto inserisciAuto(Auto  nuovaAuto) {
		return ar.save(nuovaAuto);
	}



	public List<Auto> findAllByVendutaAndMarca(String marca) {
		List<Auto> a = ar.findAllByVendutaAndMarca(true,marca);
		return a;
	}



	public void CompraAuto(String targa, String proprietario, String datavendita, String dataconsegna,String concessionarioconsegna) {
		Optional<Auto> a=ar.findById(targa);
		if (!a.isPresent()) new ResponseStatusException(HttpStatus.NOT_FOUND, "l'auto non esiste");
		if(a.get().isVenduta()) new Exception("L'auto è già stata venduta");
		
		a.get().setDataconsegna(dataconsegna);
		a.get().setDatavendita(datavendita);
		a.get().setVenduta(true);
		a.get().setProprietario(proprietario);
		a.get().setConcarrivo(concessionarioconsegna);
		ar.save(a.get());
	}

	

}
