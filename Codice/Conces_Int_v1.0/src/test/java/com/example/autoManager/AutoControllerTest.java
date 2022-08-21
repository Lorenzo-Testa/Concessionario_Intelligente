package com.example.autoManager;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.ConcesIntApplication;

@RunWith(SpringRunner.class) 
@ContextConfiguration(classes=ConcesIntApplication.class)
public class AutoControllerTest {
	
	@Autowired
	AutoController ac;
	
	@Autowired
	AutoRepository ar;

	@Test
	public void testInserisciAuto() {
		AutoOggetto auto=new AutoOggetto("bb000bb","234456","concessionaria","Fiat","Panda","Milano");
		ac.inserisciAuto(auto);
		auto=new AutoOggetto("cc000cc","34567","concessionaria","Nissan","Qashqai","Roma");
		ac.inserisciAuto(auto);
		auto=new AutoOggetto("dd000dd","45678","concessionaria","Audi","gamma s","Roma");
		ac.inserisciAuto(auto);
		assertEquals(6,ar.count());
	}


	@Test
	public void testCompraAuto() {
		AutoOggetto auto=new AutoOggetto("aa000aa","12345","concessionaria","Fiat","Panda","Bergamo");
		ac.inserisciAuto(auto);
		auto=new AutoOggetto("ee000ee","56789","concessionaria","Fiat","500","Roma");
		ac.inserisciAuto(auto);
		auto=new AutoOggetto("ff000ff","67890","concessionaria","Nissan","Micra","ROma");
		ac.inserisciAuto(auto);
		ac.CompraAuto("aa000aa", "Paolo", "2022-01-20", "2022-06-12", "Bergamo");
		ac.CompraAuto("ee000ee", "Mario", "2021-12-21", "2022-05-10", "Torino");
		ac.CompraAuto("ff000ff", "Mario", "2021-12-21", "2022-05-10", "Torino");
		assertTrue(ar.findById("aa000aa").get().isVenduta());
		
	}
	
	@Test
	public void testFindAllByVendutaAndMarca() {
		assertEquals(2,ac.findAllByVendutaAndMarca("Fiat").size());
	}

}
