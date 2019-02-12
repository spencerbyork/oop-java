import java.util.*;

public class Anagrams{
 public static void main (String[] args){
   Scanner scan = new Scanner(System.in);
   String x;
   String y;
   List<Character> word1 = new ArrayList<Character>();
   List<Character> word2 = new ArrayList<Character>();
   boolean anagram = false;

   System.out.println("This program determines if two input strings are anagrams.");
   System.out.print("#1 ");
   x = scan.nextLine();
   String a = x.toLowerCase();
   System.out.print("#2 ");
   y = scan.nextLine();
   String b = y.toLowerCase();

   word1 = findLetters(a);
   word2 = findLetters(b);

   anagram = isAnagram(word1, word2);

   if(anagram){
     System.out.println("\""+ x + "\" is an anagram of \"" + y + "\"");
   }
   if(!anagram){
     System.out.println("\""+ x + "\" is not an anagram of \"" + y + "\"");
   }
 }

 public static List<Character> findLetters(String x){
   List<Character> letters = new ArrayList<Character>();
   for(int i = 0; i < x.length(); i++){
     if(Character.isLetter(x.charAt(i))){
       letters.add(x.charAt(i));
     }
   }
   return letters;
 }

 public static boolean isAnagram(List<Character> x, List<Character> y){
   boolean check = false;
   int q = x.size();
   char a;
   char b;
   while(q > 0){
      a = x.get(0);
     for(int z = 0; z < y.size(); z++){
        b = y.get(z);

       if(a == b){
         check = true;
         y.remove(z);
         x.remove(0);
         break;
       }
     }
     q--;
   }

   if(y.size() >0 || x.size() >0){
     check = false;
   }

   return check;
 }
}
