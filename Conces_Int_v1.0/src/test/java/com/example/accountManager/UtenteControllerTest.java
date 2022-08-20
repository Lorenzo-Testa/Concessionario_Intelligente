package com.example.accountManager;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.ConcesIntApplication;

@RunWith(SpringRunner.class) 
@ContextConfiguration(classes=ConcesIntApplication.class)
public class UtenteControllerTest{
	
	@Autowired
	UtenteController c;
	@Autowired
	UtenteRepository u;
	

	
	/**
	 * TEST 1
	 * inserci nuovo utente
	 * @Assert se è stato aggiunto il db avrà 5 elementi
	 */
	@Test
	public void testInserisciUtente() {
		UtenteOggetto uo=new UtenteOggetto("Andrea","m","am","chiocciola","pass",Mansione.CAPO_FILIALE);
		c.inserisciUtente(uo);
		uo=new UtenteOggetto("Andrea","t","le","defe@fefe","provs",Mansione.CAPO_FILIALE_CENTRALE);
		c.inserisciUtente(uo);
		uo=new UtenteOggetto("laura","terf","vle","vefe@feve","pass",Mansione.MECCANICO);
		c.inserisciUtente(uo);
		uo=new UtenteOggetto("chiara","tde","cle","cde@ffec","pv",Mansione.CAPO_OFFICINA);
		c.inserisciUtente(uo);
		uo=new UtenteOggetto("Andrea","rrw","effe","deefsfe@fefe","psfrovs",Mansione.MECCANICO);
		c.inserisciUtente(uo);
		assertEquals(5,u.count());
		
	}
	
	
	/**
	 * TEST 2
	 *  utenti con la stessa mansione
	 * @assert ci sono 2 meccanici
	 */
	@Test
	public void testfindAllByMansione() {
		assertEquals(2,c.findByMansione(Mansione.MECCANICO).size());
	}
	
	/**
	 * TEST 3
	 * eliminare l'utente dalla tabella
	 * @assert il numero totale delle entità dovrebbe scendere a 4
	 */
	@Test
	public void testdeleteUtente(){
		c.deleteUtente("cle");	
		assertEquals(4,u.count());
	}
	
	/**
	 * TEST 4
	 * trovare tutti gli utenti con lo stesso nome
	 * @assert dovrebbe essere uguale a 3
	 */
	@Test
	public void testfindAllByNome(){
		String s="Andrea";
		assertEquals(3,c.findAllByNome(s).size());
	}
	
	/**
	 * TEST 5
	 * modificare la password di un utente
	 * @assert la password trovata dopo il change e quella nuova dovrebbero coincidere
	 */
	@Test
	public void testchangePassword() {
		c.changePassword("vle", "pass", "nuovo");
		assertEquals("nuovo",u.findById("vle").get().getPassword());
	}
	
	
	
	

}