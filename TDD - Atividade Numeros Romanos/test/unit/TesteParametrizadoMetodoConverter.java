package unit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import ufrpe.AlgarismoRomanoInvalidoException;
import ufrpe.ConversorDecimalRomano;

@RunWith(Parameterized.class)
public class TesteParametrizadoMetodoConverter {
	private String string;
	private int valor;
	ConversorDecimalRomano conversor;
	
	
	public TesteParametrizadoMetodoConverter(String string, int valor) {
		this.string = string;
		this.valor = valor;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
			{"III", 3},
			{"IV", 4},
			{"IX", 9},
			{"MIX", 1009},
			{"LL", 150},
			{"CC", 200},
			{"DD", 1000}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testInstanciarConversorCaracteresInvalidos() throws AlgarismoRomanoInvalidoException {
		conversor = new ConversorDecimalRomano(string);
		assertEquals(valor, conversor.converter());
	}
	
	
}
