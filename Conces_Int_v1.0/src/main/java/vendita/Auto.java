package vendita;

import java.util.*;

import com.example.interventi.Intervento;

public class Auto {
	
	public String targaAuto ;
	public String telaioAuto ;
	public String proprietario ; //codice fiscale (16 caratteri)
	public String marca ;
	public String modello ;
	public String dataConsegna ; //formato: AAAA-MM-GG
	public String dataVendita ; //formato: AAAA-MM-GG	
	public Boolean venduta ; //True: venduta, False: non venduta
	public Boolean trasporto ; // True: in trasporto, False: non in trasporto
	public String provenienza ; //Indica concessionario di provenienza
	public String lavorazione ; //Indica concessionario di lavorazione
	public String arrivo ; //Indica concessionario di arrivo


}
