import java.util.*;

public class Kiosk{
  private static String passengerFirstName = null;
  private static String passengerLastName = null;
  private static int passengerAge = 0;
  private static int desiredFlightNum = 0;
  private static int desiredSeat = 0;
  private static ArrayList<Integer> flightNums = new ArrayList<Integer>();
  private static ArrayList<Integer> flightSeats = new ArrayList<Integer>();
  private static int totalSeats = 0;
  private static ArrayList<Flight> flightList = new ArrayList<Flight>();
  private static boolean validFlightNum = false;
  private static boolean validSeat = false;
  private static int flightIndex = 0;


  public static void main(String[] args){

    setFlights();
    Scanner scanner = new Scanner(System.in);
    String command;
    System.out.println("Enter Command: ");
    command = scanner.nextLine();
    System.out.println("");

//POSSIBLE COMMANDS:
//Flights, Reserve Flight, Check Flight, Print Manifest, Exit

    while(!(command.equals("exit"))){
      command = command.toLowerCase();
    if(command.equals("reserve flight")){
      System.out.println("Hello! Please enter your information below to reserve a flight.");
      System.out.println("");
      reserveFlight();
    }
    else if(command.equals("check flight")){
      System.out.println("...Checking Flight");
      System.out.println("");
      System.out.println("*Function Not Yet Complete*");
      System.out.println("");



    }
    else if(command.equals("print manifest")){
      printManifest();
    }
    else if(command.equals("flights")){
      printAllFlights();
      System.out.println("");
    }
    else if(command.equals("exit")){
      System.out.println("Thank you. Have a nice day!");
      break;
    }
    else{
      System.out.println("*INVALID COMMAND*");
      System.out.println("Commands:");
      System.out.println("Flights, Reserve Flight, Check Flight, Print Manifest, Exit");
      System.out.println("");

    }
    System.out.println("Enter Command: ");
    command = scanner.nextLine();
    System.out.println("");
}
}


  public static void printCommands(){
    System.out.println("Commands:");
    System.out.println("Reserve Flight, Check Flight, Print Manifest, Exit");

  }

  public static void printManifest(){
    Scanner scan = new Scanner(System.in);
    int flightNumber = 0;
    System.out.println("Enter Flight Number: ");
    validFlightNum = false;
      while(!validFlightNum){
        flightNumber = scan.nextInt();
        for(int i:flightNums){
          if(i == flightNumber){
            validFlightNum = true;
          }
        }
          if(!validFlightNum){
            System.out.println("");
            System.out.println("Error: Invalid Flight #. Please Enter A New Flight #: ");
          }
      }
    int flightIndex = flightNums.indexOf(flightNumber);
    (flightList.get(flightIndex)).getPassengers();
    System.out.println("");
  }


  public static void setFlights(){
    Flight singapore = new Flight(1234, "Nashville", "Singapore", 5, 100);
    flightNums.add(singapore.getFlightNum());
    flightSeats.add(singapore.getFlightSeats());
    flightList.add(singapore);

    Flight dallas = new Flight(2345, "Nashville", "Dallas", 10, 50);
    flightNums.add(dallas.getFlightNum());
    flightSeats.add(dallas.getFlightSeats());
    flightList.add(dallas);
    System.out.println("");
  }


  public static void printAllFlights(){
    for(int i = 0; i < flightList.size(); i++){
      (flightList.get(i)).printFlight();
    }
    System.out.println("");
  }


  public static void reserveFlight(){
    Scanner scan = new Scanner(System.in);

    printAllFlights();

      System.out.println("Enter First Name: ");
        passengerFirstName = scan.nextLine();

      System.out.println("Enter Last Name: ");
        passengerLastName = scan.nextLine();

      System.out.println("Enter Age: ");
        passengerAge = scan.nextInt();

      System.out.println("Enter Flight #: ");
      validFlightNum = false;
        while(!validFlightNum){
          desiredFlightNum = scan.nextInt();
          for(int i:flightNums){
            if(i == desiredFlightNum){
              validFlightNum = true;
            }
          }
            if(!validFlightNum){
              System.out.println("");
              System.out.println("Error: Invalid Flight #. Please Enter A New Flight #: ");
            }
        }
      flightIndex = flightNums.indexOf(desiredFlightNum);
      totalSeats = flightSeats.get(flightIndex);
      System.out.println("Enter Seat #: ");
      validSeat = false;
        while(!validSeat){
          desiredSeat = scan.nextInt();
          if(desiredSeat <= totalSeats){
            validSeat = true;
          }
          if(!validSeat){
            System.out.println("");
            System.out.println("Error: Invalid Seat #. Please Enter A New Seat: ");
          }
          if(validSeat){
            if((flightList.get(flightIndex)).verifySeat(desiredSeat)){
              continue;
            }
            else{
              System.out.println("");
              System.out.println("Error: Seat Already Taken. Please Enter A New Seat: ");
              validSeat = false;
            }
          }
        }
      Passenger passenger = new Passenger(passengerLastName, passengerFirstName, passengerAge);
      System.out.println("");

      (flightList.get(flightIndex)).reserveSeat(passenger, desiredSeat);
    }


}
