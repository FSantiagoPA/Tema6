package consantiagocom.Tema06;
import java.util.Scanner;

public class ejercicio011 {

    public static  Scanner lector = new Scanner(System.in);
    public static void main(String[] args){
        String name = solicitar("Dime tu nombre");
        String surname1 = solicitar("Dime tu apellido");
        String surname2 = solicitar("Dime tu segundo apellido");

        StringBuilder sb = new StringBuilder();
        sb.append(name + " " + surname1 + " " + surname2);
        System.out.println(sb.toString());
        System.out.println();

        System.out.println(optionA(sb.toString()));
        System.out.println();

        System.out.println(optionB(sb.toString()));
        System.out.println();

        System.out.println(optionC(sb.toString()));
        System.out.println();

        System.out.println(optionD(surname2));

        System.out.println(optionE(name, surname1, surname2));
        System.out.println();

        System.out.println(optionF(sb.toString()));
        System.out.println();

        System.out.println(optionG(sb.toString()));
    }
    public static String optionA(String fullName){
        StringBuilder a = new StringBuilder();
        a.append("Lower case: " + fullName.toLowerCase() + "\n");
        a.append("Upper case: " + fullName.toUpperCase() + "\n");
        a.append("Length : " + fullName.length());
        return a.toString();
    }
    public static String optionB(String fullName){
        if(fullName.length() >= 5)
            return "First 5 characters: " + fullName.substring(0,5);
        return "There isn't 5 characters to print";
    }
    public static String optionC(String fullName){
        if(fullName.length() >= 2)
            return "Last 2 characters: " + fullName.substring(fullName.length() - 2);
        return "There isn't two characters to print";
    }
    public static int optionD(String fullName){
        char lastCharacter = fullName.charAt(fullName.length() - 1);
        int con = 0;

        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == lastCharacter) {
                con++;
            }
        }
        return con;
    }
    public static String optionE(String name, String surname1, String surname2){
        StringBuilder e = new StringBuilder();
        e.append(name.substring(0, 1).toUpperCase() + name.substring(1) + " " );
        e.append(surname1.substring(0, 1).toUpperCase() + surname1.substring(1) + " ");
        e.append(surname2.substring(0, 1).toUpperCase() + surname2.substring(1));
        return e.toString();
    }
    public static String optionF(String fullName){
        String sign = "***";
        return sign + fullName + sign;
    }
    public static String optionG(String fullName){
        String invertedName = new StringBuilder(fullName).reverse().toString();
        return invertedName.toString();
    }
    public static String solicitar(String mensaje){
        System.out.println(mensaje);
        String palabra = lector.nextLine();
        return palabra;
    }
}
