package com.example.interventi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.server.ResponseStatusException;

import com.example.ConcesIntApplication;


@RunWith(SpringRunner.class) 
@ContextConfiguration(classes=ConcesIntApplication.class)
public class InterventoControllerTest {
	
	@Autowired
	InterventoController ic;
	
	@Autowired
	InterventoRepository ir;

	@Test
	public void testInserisciIntervento() {
		idIntervento id=new idIntervento("targa","lavoro");
		InterventoOggetto a= new InterventoOggetto(id,false,"Bergamo",100);
		ic.inserisciIntervento(a);
		assertEquals(1,ir.count());
	}
	
	@Test
	public void testInterventoTerminato() {
		idIntervento id=new idIntervento("targa","lavoro");
		ic.interventoTerminato(id);
		assertTrue(ir.findById(id).get().isEseguito());
	}
	
	@Test(expected = ResponseStatusException.class)
	public void testExpInterventoTerminato() {
		idIntervento id=new idIntervento("targa","lavoro2");
		ic.interventoTerminato(id);
		}
	

	

}
