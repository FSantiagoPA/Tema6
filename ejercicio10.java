package consantiagocom.Tema06;

import java.util.Scanner;
public class ejercicio10 {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            System.out.println("Dime una palabra");
            String palabra = lector.nextLine();
            System.out.println(palabraPalindroma(palabra));
        }

        public static boolean palabraPalindroma(String palabra) {
            String palabraInvertida = new StringBuilder(palabra).reverse().toString();
            if(palabraInvertida.equalsIgnoreCase(palabra) )
                return true;
            return false;

        }
    }


