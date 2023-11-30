package consantiagocom.Tema06;
import java.util.Scanner;
public class Ejercicio15 {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args){
        int[] numbers = new int[20];
        solicitarNums(numbers);
    }
    public static void solicitarNums(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Dime el numero " + i);
            array[i] = Integer.parseInt(lector.nextLine());
        }
    }
}
