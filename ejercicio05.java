package consantiagocom.Tema06;

import java.util.Scanner;

public class ejercicio05 {
    public void encontrarPalabraMayorLongitud(String frase) {
        String[] palabras = frase.split(" ");
        String palabraMayorLongitud = "";
        int longitudMayor = 0;

        for (String palabra : palabras) {
            if (palabra.length() > longitudMayor) {
                longitudMayor = palabra.length();
                palabraMayorLongitud = palabra;
            }
        }
        System.out.println("La palabra de mayor longitud es: " + palabraMayorLongitud);
        System.out.println("Número de caracteres: " + longitudMayor);
    }
}
