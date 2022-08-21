package com.example.autoManager;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

	@Autowired
	private AutoService as;
	
	public AutoController(AutoService auto) {
		this.as = auto;
	}


	private Auto dtoToEntity(AutoOggetto autoOggetto) {
		var auto =new Auto();
		auto.setTarga(autoOggetto.getTarga());
		auto.setModello(autoOggetto.getModello());
		auto.setMarca(autoOggetto.getMarca());
		auto.setConcarrivo(autoOggetto.getArrivo());
		auto.setConcprovenienza(autoOggetto.getConcprovenienza());
		auto.setConclavorazione(autoOggetto.getConclavorazione());
		auto.setDataconsegna(autoOggetto.getDataconsegna());
		auto.setDatavendita(autoOggetto.getDatavendita());
		auto.setProprietario(autoOggetto.getProprietario());
		auto.setTelaio(autoOggetto.getTelaio());
		auto.setStato(autoOggetto.getStato());
		auto.setVenduta(autoOggetto.isVenduta());

		return auto;
	}

	
	@PostMapping(path = "inserisciAuto")
	public Auto inserisciAuto(@Valid @RequestBody AutoOggetto autoOggetto) {
		var auto = dtoToEntity(autoOggetto);
		return as.inserisciAuto(auto);
	}
	
	
	@PostMapping(path="CompraAuto")
	public void CompraAuto(String targa,String proprietario,String datavendita,String dataconsegna,String concessionarioconsegna) {
		as.CompraAuto(targa,proprietario,datavendita,dataconsegna,concessionarioconsegna);
		
	}
	
	@GetMapping(path="findAllByVendutaAndMarca")
	public List<Auto> findAllByVendutaAndMarca(String marca){
		List<Auto> a=as.findAllByVendutaAndMarca(marca);
		return a;
	}
	
}
