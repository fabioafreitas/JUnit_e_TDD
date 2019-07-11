package fibonacci;

public class Fibonacci {
	public static long iterativo(int indice) {
		if(indice == 0) 
			return 0;
		long a = 0, b = 1, aux = 0;
		for (int i = 0; i < indice-1; i++) {
			aux = a+b;
			a = b;
			b = aux;
		}
		return aux;
	}
	
	public static long recursivo(int indice) {
		return (indice == 0? 0 : (indice == 1? 1 : recursivo(indice-1) + recursivo(indice-2)));
	}
}
