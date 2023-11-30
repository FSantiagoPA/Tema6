package consantiagocom.Tema06;
import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        double[] notas = new double[30];

        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextDouble() * 10;
        }

        double sumaNotasFiveUp = 0;
        int contadorFiveUp = 0;
        double sumaTotalNotas = 0;

        //Calcular el total de las notas
        for (double nota : notas) {
            sumaTotalNotas += nota;

            //Sumar y contar las notas 5 y mayor
            if (nota >= 5) {
                sumaNotasFiveUp += nota;
                contadorFiveUp++;
            }
        }

        //Calcular media notas 5 y mayor
        double mediaNotasFiveUp = 0;
        if (contadorFiveUp > 0) {
            mediaNotasFiveUp = sumaNotasFiveUp / contadorFiveUp;
        }

        //Calcular media de todas las notas
        double mediaTotalNotas = sumaTotalNotas / notas.length;

        //Imprimir las medias
        System.out.println("Media de notas mayores o iguales a 5: " + mediaNotasFiveUp);
        System.out.println("Media total de notas: " + mediaTotalNotas);
    }
}
