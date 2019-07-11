package testCard;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import beans.Card;

@RunWith(Parameterized.class)
public class TestCardMetodoRank {

	/*
	 * Testa o método rank do objeto card para todas as as cartas
	 */
	private int pontuacaoEsperada;
	private int cardId;
	private int cardNumber;
	private String front;
	
	public TestCardMetodoRank(int pontuacaoEsperada, int cardId, int cardNumber, String front) {
		super();
		this.pontuacaoEsperada = pontuacaoEsperada;
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.front = front;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
			{1,0,0,"00.png"},
			{2,1,1,"01.png"},
			{3,2,2,"02.png"},
			{4,3,3,"03.png"},
			{5,4,4,"04.png"},
			{6,5,5,"05.png"},
			{7,6,6,"06.png"},
			{8,7,7,"07.png"},
			{9,8,8,"08.png"},
			{10,9,9,"09.png"},
			{10,10,10,"010.png"},
			{10,11,11,"011.png"},
			{10,12,12,"012.png"},
			{1,13,0,"10.png"},
			{2,14,1,"11.png"},
			{3,15,2,"12.png"},
			{4,16,3,"13.png"},
			{5,17,4,"14.png"},
			{6,18,5,"15.png"},
			{7,19,6,"16.png"},
			{8,20,7,"17.png"},
			{9,21,8,"18.png"},
			{10,22,9,"19.png"},
			{10,23,10,"110.png"},
			{10,24,11,"111.png"},
			{10,25,12,"112.png"},
			{1,26,0,"20.png"},
			{2,27,1,"21.png"},
			{3,28,2,"22.png"},
			{4,29,3,"23.png"},
			{5,30,4,"24.png"},
			{6,31,5,"25.png"},
			{7,32,6,"26.png"},
			{8,33,7,"27.png"},
			{9,34,8,"28.png"},
			{10,35,9,"29.png"},
			{10,36,10,"210.png"},
			{10,37,11,"211.png"},
			{10,38,12,"212.png"},
			{1,39,0,"30.png"},
			{2,40,1,"31.png"},
			{3,41,2,"32.png"},
			{4,42,3,"33.png"},
			{5,43,4,"34.png"},
			{6,44,5,"35.png"},
			{7,45,6,"36.png"},
			{8,46,7,"37.png"},
			{9,47,8,"38.png"},
			{10,48,9,"39.png"},
			{10,49,10,"310.png"},
			{10,50,11,"311.png"},
			{10,51,12,"312.png"},
			{1,52,-1,"00.png"},
			{10,53,13,"012.png"}
			};
		return Arrays.asList(data);
	}
	
	/*
	 * Testa o método rank sobre diversos cenários
	 */
	@Test
	public void testMetodoRank() {
		Card card = new Card(cardId, cardNumber, front);
		assertEquals(pontuacaoEsperada, card.rank());
	}
}
