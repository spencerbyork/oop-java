import java.util.*;

public class Flight {

  private int flightNum;
  private String origin;
  private String destination;
  private int numSeats;
  private Seat[] seats;
  private int basePrice;


  public Flight(int flightNum, String origin, String destination, int numSeats, int basePrice){
    this.flightNum = flightNum;
    this.origin = origin;
    this.destination = destination;
    this.numSeats = numSeats;
    this.basePrice = basePrice;


    seats = new Seat[numSeats];
    for(int i = 0; i < numSeats; i++){
      seats[i] = new Seat();
      seats[i].setPrice(basePrice);
      seats[i].setFlightNum(flightNum);
      seats[i].setSeatNum(i);

    }

  }

  public boolean verifySeat(int seatNum){
    boolean open = false;
    if(!(seats[seatNum].checkReserved())){
      open = true;
    }
    else{
      open = false;
    }
    return open;
  }

  public void reserveSeat(Passenger name, int seatNum){
    if(seats[seatNum].checkReserved() == false){
      seats[seatNum].setOccupant(name);
      seats[seatNum].print();
      System.out.println("");

    }
    else{
      System.out.println("Seat is already occupied.");
      System.out.println("");

    }
  }

  public void printFlight(){
    System.out.printf("Flight #: %-5d Flight Origin: %-10s Flight Destination: %-10s Starting Price: $%-4d", flightNum, origin, destination, basePrice);
    System.out.println("");

}

public int getFlightNum(){
  return flightNum;
}
public int getFlightSeats(){
  return numSeats;
}

public void getPassengers(){
  String last;
  String first;
  String section;
  int seatNum = 0;
  int count = 0;
  System.out.println("");

  for(int i = 0; i < numSeats; i++){
    if(seats[i].checkReserved()){
      last = seats[i].getLastName();
      first = seats[i].getFirstName();
      section = seats[i].getSection();
      seatNum = seats[i].getSeatNum();
      System.out.printf("Last: %-10s First: %-10s Seat: %-4d \n", last, first, seatNum);
      count++;
    }

  }
  if(count < 1){
    System.out.println("Empty Manifest.");
  }
}


}
