package eclemma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ufrpe.ExemploCobertura;

public class TestCobertura {
	ExemploCobertura e;
	
	/**
	 * Cobertura de comando
	 */
	@Test
	public void testCoberturaComando() {
		e = new ExemploCobertura();
		int x = 2;
		int y = 1;
		int z = 0;
		assertEquals(3, e.function(x, y, z));
	}
	
	/**
	 * Cobertura de decisãp
	 */
	@Test
	public void testCoberturaDecisao() {
		e = new ExemploCobertura();
		int x = 0;
		int y = 1;
		int z = 2;
		assertEquals(1, e.function(x, y, z));
	}
}
