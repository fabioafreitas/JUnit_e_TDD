package test;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.junit.Test;

import ufrpe.ExtencaoInvalidaException;
import ufrpe.LeitorPlanilha;

public class TestLeitorPlanilha {
	LeitorPlanilha reader;
	
	@Test
	public void testInstanciarArquivoXLSX() throws EncryptedDocumentException, IOException {
		reader = new LeitorPlanilha("lista_dados_microcefalia.xlsx");
		
		//Sheet sheet = reader.getWorkbook();
	}
	
	@Test(expected=RuntimeException.class)
	public void testInstanciarPathNulo() throws EncryptedDocumentException, IOException {
		reader = new LeitorPlanilha(null);	
	}
	
	@Test(expected=FileNotFoundException.class)
	public void testInstanciarArquivoInexistente() throws EncryptedDocumentException, IOException {
		reader = new LeitorPlanilha("planilhaInexistente.xlsx");
	}
	
	@Test(expected=IOException.class)
	public void testIntanciarDiretorio() throws EncryptedDocumentException, IOException {
		reader = new LeitorPlanilha("poi-4.1.0");
	}
	
	@Test(expected=ExtencaoInvalidaException.class)
	public void testInstanciarArquivoExtencaoInvalida() throws EncryptedDocumentException, IOException {
		reader = new LeitorPlanilha("extencaoIncorreta.txt");
	}
}
