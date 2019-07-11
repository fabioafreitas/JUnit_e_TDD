package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.carrinhoCompras.TesteShoppingCart;
import test.cifraRotacional.TesteCifraRotacional;
import test.fibonacci.TesteFibonacci;;

@RunWith(Suite.class)
@SuiteClasses({
	TesteShoppingCart.class, 
	TesteCifraRotacional.class,
	TesteFibonacci.class
})
public class SuiteDeTestes {
	
}
