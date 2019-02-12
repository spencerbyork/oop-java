public class Seat{
  private String section;
  private int seatNum;
  private int markup;
  private int price;
  private Passenger occupant;
  private int basePrice;
  private boolean reserved = false;
  private int flightNum;

  public Seat(){
    section = "";
    seatNum = 0;
    markup = 0;
    occupant = null;
    basePrice = 0;
  }

  public void setSection(String section){
    this.section = section;
  }
  public void setSeatNum(int num){
    this.seatNum = num;
  }
  public void setPrice(int price){
    this.price = price;
  }
  public void setFlightNum(int flightNum){
    this.flightNum = flightNum;
  }
  public void setMarkup(int markup){
    this.markup = markup;
  }
  public void setOccupant(Passenger name){
    this.occupant = name;
    this.reserved = true;
  }

  public String getSection(){
    return section;
  }
  public int getSeatNum(){
    return seatNum;
  }
  public int getMarkup(){
    return markup;
  }
  public int getPrice(){
    return price;
  }
  public Passenger getPassenger(){
    return occupant;
  }
  public boolean checkReserved(){
    return reserved;
  }
  public int getFlightNum(){
    return flightNum;
  }
  public String getLastName(){
    return occupant.getLastName();
  }
  public String getFirstName(){
    return occupant.getFirstName();
  }



  public void print(){
      System.out.println("Flight #: " + getFlightNum());
      System.out.println("Seat #: " + getSeatNum());
      System.out.println("This seat is reserved for: " + occupant.getFirstName() + " " + occupant.getLastName());
      System.out.println("Seat Price: " + getPrice());
    }


}
