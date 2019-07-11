package test.carrinhoCompras;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import carrinhoCompras.Product;
import carrinhoCompras.ShoppingCart;

@RunWith(Parameterized.class)
public class TesteParametrizacao {
	
	private String nome;
	private double valor;
	private ShoppingCart shop;
	
	
	public TesteParametrizacao(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	@Before
	public void InicializaShop() {
		shop = new ShoppingCart();
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
		{"pao", 1},
		{"pao", 1},
		{"pao", 1}};
		return Arrays.asList(data);
 	}
	
	/*
	 * 
	 */
	@Test
	public void testeAdicionandoItens() {
		Product pao = new Product(nome, valor);
		shop.addItem(pao);
		
	}
}
