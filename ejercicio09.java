package consantiagocom.Tema06;

public class ejercicio09 {
    public static void main (String [] args){
        String frace1= "cocodrilo bellaco brr";
        System.out.println(fraseImpares(frace1));
    }
    public static String fraseImpares(String s1){
        StringBuilder sb = new StringBuilder();
        s1=s1.trim().replaceAll("\\s+", " ");
        for (int i=0; i<s1.length(); i++){
            if(i%2!=0){
                sb.append(s1.charAt(i));
            }

        }
        return sb.toString();

    }

}
