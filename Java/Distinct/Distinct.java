import java.util.*;

public class Distinct {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int x = 0;
      List<Integer> nums = new ArrayList<Integer>();
      int count = 0;
      boolean check = false;

      while(x != -1){
        x = scan.nextInt();
        if(count < 1){
          nums.add(x);
          count = 2;
        }
        else{
          for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == x){
              check = true;
            }
            }
            if(!check){
              nums.add(x);
          }
        }
        check = false;
      }
      nums.remove(nums.size()-1);

      int[] temps = new int[nums.size()];
      for(int i = 0; i < temps.length; i++){
        temps[i] = nums.get(i);
      }

      System.out.print("(");
      for(int i = 0; i < temps.length; i++){
        System.out.printf("%3d", temps[i]);
        if(i!=temps.length-1){
          System.out.print(",");
        }
        else{
          System.out.print(")");
        }


      }

    }
}
