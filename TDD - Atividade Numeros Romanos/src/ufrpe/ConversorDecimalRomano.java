package ufrpe;

public class ConversorDecimalRomano {
	private String romano;

	public ConversorDecimalRomano(String romano) throws AlgarismoRomanoInvalidoException {
		if(romano == null)
			throw new RuntimeException("String nula");
		if(!algarismoRomanoValido(romano))
			throw new AlgarismoRomanoInvalidoException("Algarismo invalido");
		this.romano = romano;
	}
	
	/**
	 * I = 1
	 * V = 5
	 * X = 10
	 * L = 50
	 * C = 100
	 * D = 500
	 * M = 1000
	 * 
	 * checar caracter a caracter. se o proximo caracter 
	 * em relação ao atual tiver valor maior q o atual
	 *	-subtraio o maior do menor
	 *	-senao apenas somo os valores
	 * 
	 * @return
	 */
	public int converter() {
		char[] string = romano.toCharArray();
		char anterior = string[0], atual;
		int total = 0;
		for (int i = 1; i < string.length; i++) {
			atual = string[i];
			if(valorDecimal(anterior) < valorDecimal(atual))
				total +=  valorDecimal(atual) - valorDecimal(anterior);
			else if(valorDecimal(anterior) == valorDecimal(atual))
				total += valorDecimal(atual) - valorDecimal(anterior);
		}
		return total;
	}
	
	public String getRomano() {
		return this.romano;
	}
	 
	/**  
	 * Checa se a string de entrada possui
	 * algarismos romanos válidos
	 * 
	 * string com caracteres validos fora de ordem
	 * tambem eh invalida
	 * @return true se eh algarismo valido
	 */
	private boolean algarismoRomanoValido(String string) {
		char[] vetor = string.toCharArray();
		int count = 0;
		for (int i = 0; i < vetor.length; i++) {
			if( vetor[i] == 'I' || vetor[i] == 'V' || 
				vetor[i] == 'X' || vetor[i] == 'L' || 
				vetor[i] == 'C' || vetor[i] == 'D' || 
				vetor[i] == 'M')
				count++;
		}
		return count == string.length();
	}
	
	private int valorDecimal(char a) {
		switch(a) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		default:
			return 1000; 
		}
	}
	
}
