package cosantiagocom.Tema06;

public class ejercicio03 {
    public static void main (String [] args){
        System.out.println(countWorlds("Hola mundo hermoso"));
    }
    public static int countWorlds(String s){
        s=s.trim().replaceAll("\\s+", " ");
        if(s.equals(""))
            return 0;

        int count = 1;

        for(int i=0; i<s.length();i++){
           if (s.charAt(i) == ' ')
               count++;
        }
        return count;
    }
}
