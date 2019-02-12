import java.util.*;

public class Delivery{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    int [] zips = {12789, 54012, 54481, 54982, 60007, 60103, 60187, 60188, 71244, 90210};

    double [] prices = {2.40, 3.00, 3.50, 4.00, 4.50, 5.00, 5.25, 5.75, 6.10, 10.00};

    System.out.println("Delivery Charge");
    System.out.print("Enter a ZIP code for delivery: ");


    int zip_code = scan.nextInt();
    boolean zc = false;
    double price = 0;
    for (int i = 0; i < zips.length; i++){
      if(zip_code == zips[i]){
        zc = true;
        price = prices[i];
        break;
      }
      else{
        zc = false;
      }
    }
    if(zc){
    System.out.println("Delivery charge is: " + price);
  }
  else{
    System.out.println("Sorry: no delivery to " + zip_code);
  }
  }
}
