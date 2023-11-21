package cosantiagocom.Tema06;

public class ejercicio01 {
    public static void main (String[] args){
        String s1 = "hola";
        System.out.println(firstUpperCase(s1));

    }
    public static String firstUpperCase(String s){
        if (s == null || s.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder(s.length());
        sb.append(Character.toUpperCase(s.charAt(0)));
        sb.append(s.substring(1));
        return sb.toString();
    }
}
