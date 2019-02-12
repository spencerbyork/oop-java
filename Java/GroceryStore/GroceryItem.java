import java.util.Scanner;

public class GroceryItem{
  private int stockNum = 0;
  private double price = 0.0;
  private int quantity = 0;


  public static void main (String[] args){

}



  private void inputStockNum(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Stock Number: ");
    int input = sc.nextInt();
    while(input < 1000 || input > 9999){
      System.out.print("Error, please enter new Stock Number: ");
      input = sc.nextInt();
    }
    this.stockNum = input;
  }

  private void inputPrice(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter item price: ");
    double price = sc.nextDouble();
    this.price = price;
  }

  private void inputQuantity(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter quantity in stock: ");
    int quantity = sc.nextInt();
    this.quantity = quantity;
  }

  private double getTotalValue(){
    return this.price * this.quantity;
  }

  public void print(){
    System.out.println("Stock Number: " + this.stockNum);
    System.out.println("Price: $" + this.price);
    System.out.println("Quantity in stock: " + this.quantity);
  }

  public void dataEntry(){
    inputStockNum();
    inputPrice();
    inputQuantity();
  }
}
