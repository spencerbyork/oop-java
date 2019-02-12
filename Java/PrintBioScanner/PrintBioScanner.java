import java.util.*;

public class PrintBioScanner{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first name: ");
    String x = scan.nextLine();
    System.out.print("Enter last name: ");
    String y = scan.nextLine();
    System.out.print("Enter DOB: ");
    String z = scan.nextLine();
    System.out.print("Enter major: ");
    String a = scan.nextLine();
    System.out.println();

    System.out.println("First name:\t"+ x);
    System.out.println("Last name:\t"+ y);
    System.out.println("DOB:\t\t"+ z);
    System.out.println("Major:\t\t"+ a);
  }
}
