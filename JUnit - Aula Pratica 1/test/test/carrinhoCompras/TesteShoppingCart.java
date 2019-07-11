package test.carrinhoCompras;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import carrinhoCompras.Product;
import carrinhoCompras.ProductNotFoundException;
import carrinhoCompras.ShoppingCart;

public class TesteShoppingCart {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	/*
	 * Verifica se ao criar uma nova instância de carrinho,
	 * ela inicializa com 0 itens no carrinho
	 */
	@Test
	public void testCriarNovoCarrinho() {
		ShoppingCart carrinho = new ShoppingCart();
		assertEquals(0, carrinho.getItemCount());
	}
	
	/*
	 * Testa se ao adicionar um item do carrinho, a quantidade
	 * de itens no carrinho incrementa
	 */
	@Test
	public void testAdicionandoItem() {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", 1.25);
		int antesAdicionar = carrinho.getItemCount();
		carrinho.addItem(pao);
		int depoisAdicionar = carrinho.getItemCount();
		assertEquals(depoisAdicionar, antesAdicionar+1);
	}
	
	@Test
	public void testAdicionarItemNull() {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = null;
		carrinho.addItem(pao);
		assertNotNull(pao);
	}
	
	@Test
	public void testAdicionarItemValorNegativo() {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", -1.25);
		carrinho.addItem(pao);
		assertEquals(0, carrinho.getBalance());
	}
	
	/*
	 * Testa se ao remover um item do carrinho, a quantidade
	 * de itens no carrinho decrementa
	 */
	@Test
	public void testRemoverItem() throws ProductNotFoundException {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", 1.25);
		carrinho.addItem(pao);
		int antes = carrinho.getItemCount();
		carrinho.removeItem(pao);
		int depois = carrinho.getItemCount();
		assertEquals(depois, antes-1);
	}
	
	/*
	 * Testa se ao esvaziar o carrinho
	 * a quantidade de itens armazenada é realmente zero
	 */
	@Test
	public void testCarrinhoVazio() throws ProductNotFoundException {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", 1.25);
		carrinho.addItem(pao);
		carrinho.removeItem(pao);
		assertEquals(0, carrinho.getItemCount());
	}
	
	/*
	 * 
	 */
	@Test
	public void testBalancoCarrinhoVazio() {
		ShoppingCart carrinho = new ShoppingCart();
	}
	
	/*
	 * Testa se o balanço do carrinho
	 * antes de adicionar um item
	 * é igual a ele mais o valor do item
	 */
	@Test
	public void testBalancoCarrinhoAdicionarItem() {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", 1.25);
		carrinho.addItem(pao);
		double balanceAfter = carrinho.getBalance();
		assertEquals(1.25, balanceAfter, 0.001);
	}
	
	/*
	 * Testa de levanta a exception ao remove um item
	 * inexistente do carrinho
	 */
	@Test(expected = ProductNotFoundException.class)
	public void testRemoverItemInexistente() throws ProductNotFoundException {
		ShoppingCart carrinho = new ShoppingCart();
		Product pao = new Product("Pao", 1.25);
		carrinho.removeItem(pao);
		//fail("Exception ProductNotFoundException nao levantada");
	}
}
