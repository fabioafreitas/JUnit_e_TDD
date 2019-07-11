package test.cifraRotacional;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cifraRotacional.CifraRotacional;

public class TesteCifraRotacional {
	/*
	 * Testa se a o método retorna a codificação correta sobre a  chave 5
	 */
	@Test
	public void testCodificacaoCorreta() {
		int chave = 5;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "casa";
		String result = cifra.codificar(texto);
		assertEquals("hfxf", result);
	}
	
	/* 
	 * Testa se a decodificação ocorre corretamente
	 */
	@Test
	public void testDecodificar() {
		int chave = 5;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "hfxf";
		String result = cifra.decodificar(texto);
		assertEquals("casa", result);
	}
	
	/*
	 * Testa se a codificação de uma chave a cima do 26 funciona
	 */
	@Test
	public void testCodificarChaveACimaDoLimite() {
		int chave = 31;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "casa";
		String result = cifra.codificar(texto);
		assertEquals("hfxf", result);
	}
	
	/*
	 * Testa se a codificação de uma chave a cima do 26 funciona
	 */
	@Test
	public void testDecodificarChaveACimaDoLimite() {
		int chave = 31;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "hfxf";
		String result = cifra.codificar(texto);
		assertEquals("casa", result);
	}
	
	/*
	 * Testa se a codificação de uma chave abaixo do 0 funciona
	 */
	@Test
	public void testCodificarChaveAbaixoDoLimite() {
		int chave = -5;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "casa";
		String result = cifra.codificar(texto);
		assertEquals("hfxf", result);
	}
	
	/*
	 * Testa se a codificação de uma chave abaixo do 0 funciona
	 */
	@Test
	public void testDecodificarChaveAbaixoDoLimite() {
		int chave = -5;
		CifraRotacional cifra = new CifraRotacional(chave);
		String texto = "hfxf";
		String result = cifra.codificar(texto);
		assertEquals("casa", result);
	}
}
