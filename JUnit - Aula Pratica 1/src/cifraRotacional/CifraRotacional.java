package cifraRotacional;

public class CifraRotacional {
    private int rot;

    public CifraRotacional(int rot) {
        this.rot = rot;
    }

    public String codificar(String a) {
        char[] charA = a.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] <= 'Z' && charA[i] >= 'A') {
                charA[i] = charA[i]+rot > 'Z' ? (char)(charA[i]+rot -26) : (char)(charA[i]+rot);
            }
            else if (charA[i] <= 'z' && charA[i] >= 'a'){
                charA[i] = charA[i]+rot >= 'z' ? (char)(charA[i]+rot -26) : (char)(charA[i]+rot);
            }

        }
       return String.valueOf(charA);
    }
    
    public String decodificar(String a) {
        char[] charA = a.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] <= 'Z' && charA[i] >= 'A') {
                charA[i] = charA[i]+rot < 'A' ? (char)(charA[i]-rot +26) : (char)(charA[i]-rot);
            }
            else if (charA[i] <= 'z' && charA[i] >= 'a'){
                charA[i] = charA[i]-rot < 'a' ? (char)(charA[i]-rot +26) : (char)(charA[i]-rot);
            }
            
        }
       return String.valueOf(charA);
    }
    

    
    
    
   
}