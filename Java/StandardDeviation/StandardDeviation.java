import java.util.*;

public class StandardDeviation {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int size = 0;
      Double num = 0.0;
      Double means = 0.0;
      Double end = 0.0;

      System.out.print("How many numbers? ");
      size = scan.nextInt();
      double[] nums = new double[size];
      System.out.println("Enter " + size + " numbers:");
      for(int i = 0; i < size; i++){
        num = scan.nextDouble();
        nums[i] = num;
      }

      end = standardDeviation(nums, size);
      System.out.printf("Standard Deviation: %.3f", end);

  }

      public static double mean(double [] array){
        Double add = 0.0;
        int size = array.length;
        for(double i: array){
          add += i;
        }
        return(add/size);
      }

      public static double standardDeviation(double[] array, int numberofelementsinarray){
        Double x = 0.0;
        Double temp = 0.0;
        Double mean = mean(array);
        for(double i: array){
          if(i > mean){
          temp = (i - mean);
          x += temp * temp;
          }
          else if(i < mean){
            temp = (mean - i);
            x += temp * temp;

          }
        }
        x = (x/numberofelementsinarray);
        x = Math.sqrt(x);
        return x;
      }


  }
