import java.util.*;

public class CountPrimes{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    int x = scan.nextInt();
    int count = 2;
    int y = 1;
    List<Integer> nums = new ArrayList<Integer>();

    for(int i = 0; i < x; i ++){
      nums.add(i+1);
    }

    int a = nums.size() - 1;

    while(count <= a/2){
      for(int i = y; i <= (a); i+=count){
        if((count != nums.get(i))){
          nums.set(i,0);
        }
      }

    for(int i = y; i <= nums.size()-1 ; i++){
      if((nums.get(i) != count) && (nums.get(i) != 0)){
        count = nums.get(i);
        y = count-1;
        break;
      }
    }

  }

nums.set(0,0);

  for(int i = a; i >= 0; i--){
    if(nums.get(i) == 0){
    nums.remove(i);
    }
  }

  System.out.println(nums.size());

  }
}
