import java.util.*;

public class Switch {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Please enter your grade: ");
      int grade = scan.nextInt();
      String letter;
      double y = grade/10;
      int x = grade/10;

      switch(x){
      case 10:
        letter = "A";
        System.out.println("A grade of " + grade + " is a " + letter + ".");
        break;
      case 9:
          letter = "A";
          System.out.println("A grade of " + grade + " is a " + letter + ".");
          break;
      case 8:
              letter = "B";
              System.out.println("A grade of " + grade + " is a " + letter + ".");
              break;
      case 7:
                letter = "C";
                System.out.println("A grade of " + grade + " is a " + letter + ".");
                break;
      case 6:
                  letter = "D";
                  System.out.println("A grade of " + grade + " is a " + letter + ".");
                  break;
      case 5:
                      letter = "F";
                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                      break;
                      case 4:
                                      letter = "F";
                                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                                      break;
                                      case 3:
                                                      letter = "F";
                                                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                                                      break;
                                                      case 2:
                                                                      letter = "F";
                                                                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                                                                      break;
                                                                      case 1:
                                                                                      letter = "F";
                                                                                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                                                                                      break;
                                                                                      case 0:
                                                                                                      letter = "F";
                                                                                                      System.out.println("A grade of " + grade + " is an " + letter + ".");
                                                                                                      break;
    default:

                		System.out.println("A grade of " + x + " is not valid.");
                		break;



}


      }
      }
