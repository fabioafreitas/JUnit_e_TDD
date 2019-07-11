package ufrpe;

public class ExemploCobertura {
	public int function(int x, int y, int z) {
		if(x>y+z) {
			x = y+1;
		}
		x = x+1;
		return x;
	}
}
