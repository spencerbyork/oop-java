import java.util.Scanner;

public class OutputFormatting {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userWord;
      int userNum;

      userWord = scnr.next();
      userNum = scnr.nextInt();
      System.out.println(userWord + "_" + userNum); /* Your solution goes here  */

   }
}
