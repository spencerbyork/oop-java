import java.util.*;

public class Exam{
 public static void main (String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the character: ");
   String x = scan.nextLine();
   char ch = x.charAt(0);
   System.out.print("Enter the peak: ");
   int size = scan.nextInt();

   isosceles(ch, size);

 }

 public static void isosceles(char ch, int height){
   int count = 1;
   for(int i = 0; i < height; i++){
     count = 0;
     while(count < i+1){
       System.out.print(ch);
       count++;
     }
     System.out.print("\n");
   }

   for(int i = height-1; i >=0; i--){
     count = 0;
     while(count < i){
       System.out.print(ch);
       count++;
     }
     if(i != 0){
     System.out.print("\n");
   }


   }
 }
}
