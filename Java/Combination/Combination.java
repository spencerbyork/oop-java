import java.util.*;

public class Combination{
 public static void main (String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter an integer: ");
   int n = scan.nextInt();
   System.out.print("Enter another Integer: ");
   int k = scan.nextInt();

   int value = combinations(n, k);
   System.out.println("combinations(" + n + "," + k + ") = " + value);
 }

 public static int factorial(int n){
   if (n<= 1)
   return 1;

   return (n * factorial(n-1));
 }

 public static int combinations(int n, int k){
   return (factorial(n) / (factorial(k) * factorial (n-k)));
 }
}
