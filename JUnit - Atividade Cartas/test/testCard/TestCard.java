package testCard;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import beans.Card;



public class TestCard {
	
	public Card card;
	
	// nipes de 0 a 3
	// 52 cartas
	// 13 conjuntos de 0 a 12 (ids)
	// Ás ao 10 valem 10, as demais valem 10
	// 
	
	/*
	 * Testa se é possível instanciar um objeto carta
	 */
	@Test
	public void testInstanciandoCard() {
		card = new Card(0, 0, "00.png");
		assertNotNull(card);
	}
	
	/*
	 * indica falha, pois é possivel instanciar classe com id fora do
	 * intervalo 0 a 12
	 */
	@Test
	public void testInstanciandoCardNumberNegativo() {
		card = new Card(0, -1, "00.png");
		fail("O intervalo de valores para o CardNumber é 0 a 12, porém valores fora deste intervalo são aceitos");
	}
	
	/*
	 * Indica falha, pois é possível criar carta com nome nulo
	 */
	@Test(expected=RuntimeException.class)
	public void testInstanciandoCardFrontNula() {
		card = new Card(0, 0, null);
	}
	
	/*
	 * Testa se o método isAce retorna true para a carta ace
	 */
	@Test
	public void testMetodoIsAce() {
		card = new Card(0, 0, "00.png");
		assertEquals(true, card.isAce());
	}
	
	/*
	 * Testa se a função isAce retorna false paera cartas que não sejam o Às
	 */
	@Test
	public void testMetodoIsAceParaCartaNaoAs() {
		card = new Card(1, 1, "01.png");
		assertEquals(false, card.isAce());
	}

	@Test(expected = RuntimeException.class)
	public void testMetodoToStringParaFrontNulo() {
		card = new Card(1, 1, null);
		card.toString();
	}
	
	
}
