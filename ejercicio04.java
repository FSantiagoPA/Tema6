package cosantiagocom.Tema06;

public class ejercicio04 {
    public static void main(String[] args) {
        String oracion = "Hola como estas";
        String[] listaPalabras = oracion.split("\\s+");
        for (String palabra : listaPalabras)  {
            System.out.println(palabra + ": tiene un total de " + contarVocales(palabra) + " vocales y tiene un total de " + numConsonantes(palabra) + " consonantes" );

        }
    }

    public static int contarVocales(String palabra){
        int numVocales = 0;
        palabra = palabra.toLowerCase();
        String vocales = "aeiou";

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j)) {
                    numVocales ++;
                }
            }
            /*
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' ||palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u' ) {
                numVocales++;
            }
             */
        }
        return numVocales;
    }

    public static int numConsonantes(String palabra){
        String vocales = "aeiou ";
        boolean esCon = true;
        int consonantes = 0;
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j))
                    esCon = false;
            }
            if (esCon)
                consonantes++;

            esCon = true;
        }
        return consonantes;
    }
}
