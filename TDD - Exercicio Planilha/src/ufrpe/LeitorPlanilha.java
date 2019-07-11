package ufrpe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class LeitorPlanilha {
	Workbook workbook;
	public LeitorPlanilha(String fileSheet) throws EncryptedDocumentException, IOException {
		if(fileSheet == null) 
			throw new RuntimeException("Path nulo");
		
		File file = new File(fileSheet);
		
		if(file == null)
			throw new FileNotFoundException("Planilha nao existe");
		
		workbook = WorkbookFactory.create(file);
	}

	public Workbook getWorkbook() {
		return workbook;
	}

}
