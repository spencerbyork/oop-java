import java.util.*;

public class CollatzConjecture {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("First Number: ");
      int x = scan.nextInt();
      System.out.print("");
      System.out.print("Second Number: ");
      int y = scan.nextInt();

      int max = 0;
      int z;
      int temp;


      if(x < y){
        x = x;
        y = y;

      }
      else if (x > y){
        temp = x;
        x = y;
        y = temp;
      }

      for (int a = x; a <= y; a++){
        int num = 0;
        int count = 0;
        int b = a;
        while(num != 1){
          if (b%2 == 0){
            b= b/2;
            count++;
            num = b;
          }
        else{
          b = ((b*3) + 1);
          count++;
          num = b;
        }
        if(count > max){
          max = count;
        }
      }

    }
    max++;
    System.out.println("Maximum cycle between " + x + " and " + y + " is " + max);
  }
}
