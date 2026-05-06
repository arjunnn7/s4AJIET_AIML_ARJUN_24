import java.util.HashMap;
import java.util.Arrays;


class Main {
    public static void main(String args[]) {
        String S1="silent";
        String S2="listen";
        if(isAnagram(S1,S2)){
            System.out.println("anagram");
        }
        else
        {
           System.out.println("not anagram");  
        }
        }
       public static boolean isAnagram(String S1,String S2)
       {
         if(S1.length()!=S2.length())
         {
           return false;
         }
           char[] S11=S1.toCharArray();
           char[] S22=S2.toCharArray();
           Arrays.sort(S11);
           Arrays.sort(S22);
         
         return Arrays.equals(S11,S22);
    }      
}
