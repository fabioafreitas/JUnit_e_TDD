package testDeck;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import beans.Card;
import beans.Deck;

public class TestDeck {

	private Deck deck;
	
	/*
	 * Testa o o objeto deck pode ser instanciado com sucesso
	 */
	@Test
	public void testInstanciandoDeck() {
		deck = new Deck();
		assertNotNull(deck);
	}
	
	
	/*
	 * Testa se o método isEmpety retorna o valor 52
	 * , da quantidade de cartas após instanciar um deck
	 */
	@Test
	public void testMetodoIsEmpty() {
		deck = new Deck();
		assertEquals(false, deck.isEmpty());
	}
	
	/*
	 * Testa se o método isEmpty retorna false, após embaralhar
	 * o deck
	 */
	@Test
	public void testMetodoIsEmptyAposEmbaralhar() {
		deck = new Deck();
		deck.shuffle();
		assertEquals(false, deck.isEmpty());
	}
	
	@Test
	public void testMetodoSize() {
		deck = new Deck();
		assertEquals(52, deck.size());
	}
	
	/*
	 * Testa se a quantidade de cartas, após embaralhar,
	 * continua 52
	 */
	@Test
	public void testMetodoSizeAposEmbaralhar() {
		deck = new Deck();
		deck.shuffle();
		assertEquals(52, deck.size());
	}
	
	/*
	 * Testa se o método DealWith retorna um Card
	 * e a quantidade de cartas no deck é subtraida
	 */
	@Test
	public void testMetodoDealWith() {
		deck = new Deck();
		Card card = deck.dealFrom();
		assertEquals(51, deck.size());
	}
	
	/*
	 * Testa se o método dealWith para de retirar cards
	 * quando o deck está vazio
	 */
	@Test
	public void testDealWithParaDeckVazio() {
		deck = new Deck();
		Card card = null;
		for (int i = 0; i < 52; i++) {
			card = deck.dealFrom();
		}
		card = deck.dealFrom();
		
		assertEquals(0, deck.isEmpty());
	}
	
	/*
	 * Testa se o método shuffle reordena o deck
	 */
	@Test
	public void testMetodoShuffle() {
		deck = new Deck();
		deck.shuffle();
		int countShuffle = 0;
		for (int i = 0; i < 52; i++) {
			if(deck.dealFrom().rank() != (i+1)%11)
				countShuffle++;
		}
		assertNotEquals(0, countShuffle);
	}
	
	@Test
	public void testMetodoIsEmptyFalse() {
		deck = new Deck();
		Card card = deck.dealFrom();
		assertFalse(deck.isEmpty());
	}

	@Test
	public void testMetodoIsEmptyTrue() {
		deck = new Deck();
		Card aux;
		for (int i = 0; i < 52; i++) {
			aux = deck.dealFrom();
		}
		assertTrue(deck.isEmpty());
	}
}
