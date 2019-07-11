package unit;

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
public class TesteParametrizadoConversor {
	private String string;
	ConversorDecimalRomano conversor;
	
	
	public TesteParametrizadoConversor(String string) {
		this.string = string;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
			{"abf"},
			{"abfI"},
			{"abfV"},
			{"abfX"},
			{"abfL"},
			{"abfC"},
			{"abfD"},
			{"abfM"},
			{"CIM"},
			{"MMMMIIII"},
			{""},
			{"MMIMCM"} /* MMMDCCCXCIX*/
		};
		return Arrays.asList(data);
	}
	
	@Test(expected=AlgarismoRomanoInvalidoException.class)
	public void testInstanciarConversorCaracteresInvalidos() throws AlgarismoRomanoInvalidoException {
		conversor = new ConversorDecimalRomano(string);
	}
	
	
}
