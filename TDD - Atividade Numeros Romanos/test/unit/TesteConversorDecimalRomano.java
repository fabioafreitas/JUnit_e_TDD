package unit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import ufrpe.ConversorDecimalRomano;
import ufrpe.AlgarismoRomanoInvalidoException;

public class TesteConversorDecimalRomano {
	ConversorDecimalRomano conversor;
	
	@Test
	public void testInstanciarConversorStringNaoNula() throws AlgarismoRomanoInvalidoException {
		String romano = "III";
		conversor = new ConversorDecimalRomano("III");
		assertTrue(conversor.getRomano().equals(romano));
	}
	
	@Test(expected=RuntimeException.class)
	public void testInstanciarConversorStringNula() throws AlgarismoRomanoInvalidoException {
		conversor = new ConversorDecimalRomano(null);
	}
	
	@Test
	public void testMetodoGetRomano() throws AlgarismoRomanoInvalidoException {
		conversor = new ConversorDecimalRomano("III");
		assertTrue("III".equals(conversor.getRomano()));
	}
}
