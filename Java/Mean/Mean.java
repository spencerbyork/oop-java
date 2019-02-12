import java.util.*;

public class Mean {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int size = 0;
     Double num = 0.0;
     Double end = 0.0;

     System.out.print("What is the size of the array? ");
     size = scan.nextInt();
     double[] nums = new double[size];
     for(int i = 0; i < size; i++){
       num = scan.nextDouble();
       nums[i] = num;
     }

     end = mean(nums);
     System.out.printf("The average of these %d numbers is %.2f.", size, end);
}

     public static double mean(double [] array){
       Double add = 0.0;
       int size = array.length;
       for(double i: array){
         add += i;
       }
       return(add/size);
     }


}
