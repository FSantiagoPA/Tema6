package consantiagocom.Tema06;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un array de 20 elementos numéricos
        double[] array = new double[10];
        double suma = 0;
        // Introducir elementos en el array
        System.out.println("¿Cuanto mides?");

        for (int i = 0; i < array.length; i++) {
            System.out.print(("Estatura " + (i + 1) + ": "));
            array[i] = scanner.nextDouble();
            suma += array[i];
        }

        double media = calcularMedia(suma, array.length);
        System.out.println("Media: " + media);

        System.out.println("Estaturas superiores a la media:");
        for (double estatura : array) {
            if (estatura > media) {
                System.out.println(estatura);
            }
        }
    }

    public static double calcularMedia(double suma, int contador) {
        return suma / contador;
    }
}
