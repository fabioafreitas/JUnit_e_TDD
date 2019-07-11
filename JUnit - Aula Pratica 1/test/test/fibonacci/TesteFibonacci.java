package test.fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fibonacci.Fibonacci;


@RunWith(Parameterized.class)
public class TesteFibonacci {

	private int indice;
	
	public TesteFibonacci(int indice) {
		this.indice = indice;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{34},{35},{36},{37},{38},{39},{40},{41},{42},{43},{44},{45}};
		return Arrays.asList(data);
	}
	
	@Test(timeout = 100) 	// a partir de 199000000 elapsed time acima de 1s
	public void testMetodoFibonacciIterativo() {
		Fibonacci.iterativo(indice);
	}
	
	@Test(timeout = 100)	// a partir de 37 elapsed time acima de 1s
	public void testMetodoFibonacciRecursivo() {
		Fibonacci.recursivo(indice);
	}
}
