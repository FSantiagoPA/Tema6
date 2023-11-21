package cosantiagocom.Tema06;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String [] args){
        Scanner snd = new Scanner(System.in);
        String palabra;
        int vocales=0, consonantes =0;
        System.out.println("Ingrese una frase");
        palabra =snd.nextLine();

        for (int i=0; i<palabra.length(); i++){
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='A')||
                    ((palabra.charAt(i)=='e')) || (palabra.charAt(i)=='E')||
                    ((palabra.charAt(i)=='i')) || (palabra.charAt(i)=='I')||
                    ((palabra.charAt(i)=='o')) || (palabra.charAt(i)=='O')||
                    ((palabra.charAt(i)=='u')) || (palabra.charAt(i)=='U')){
                    vocales++;
            }
            else
                    consonantes++;
        }
        System.out .println("La palabras "+palabra+" contiene un total de: "+vocales+" vocales");
        System.out .println("La palabras "+palabra+" contiene un total de: "+consonantes+" consonantes");
    }

}

