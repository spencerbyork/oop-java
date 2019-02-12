import java.util.*;

public class Player extends GenericPlayer implements Reportable{

  protected static String name;
  protected int numberOfWins;
  protected int numberOfLosses;
  protected int numberOfTies;
  protected static int numberOfGamesPlayed;

  public Player(){
    this.name = null;
    this.numberOfWins = 0;
    this.numberOfLosses = 0;
    this.numberOfTies = 0;
    this.numberOfGamesPlayed = 0;
  }
  public Player(String playerName){
    this.name = playerName;
    this.numberOfWins = 0;
    this.numberOfLosses = 0;
    this.numberOfTies = 0;
    this.numberOfGamesPlayed = 0;
  }

  public void playOpponent(Player player2, String p1choice, String p2choice){

    if(p1choice.equals("rock") && p2choice.equals("scissors")){
      setNumberOfWins();
      this.numberOfGamesPlayed++;
      player2.setNumberOfLosses();
    }
    else if(p1choice.equals("paper") && p2choice.equals("scissors")){
      setNumberOfLosses();
      this.numberOfGamesPlayed++;
      player2.setNumberOfWins();
    }
    else if(p1choice.equals("scissors") && p2choice.equals("scissors")){
      setNumberOfTies();
      this.numberOfGamesPlayed++;
      player2.setNumberOfTies();
    }
    else if(p1choice.equals("rock") && p2choice.equals("paper")){
      setNumberOfLosses();
      this.numberOfGamesPlayed++;
      player2.setNumberOfWins();
    }
    else if(p1choice.equals("paper") && p2choice.equals("paper")){
      setNumberOfTies();
      this.numberOfGamesPlayed++;
      player2.setNumberOfTies();
    }
    else if(p1choice.equals("scissors") && p2choice.equals("paper")){
      setNumberOfWins();
      this.numberOfGamesPlayed++;
      player2.setNumberOfLosses();
    }
    else if(p1choice.equals("rock") && p2choice.equals("rock")){
      setNumberOfTies();
      this.numberOfGamesPlayed++;
      player2.setNumberOfTies();
    }
    else if(p1choice.equals("paper") && p2choice.equals("rock")){
      setNumberOfWins();
      this.numberOfGamesPlayed++;
      player2.setNumberOfLosses();
    }
    else if(p1choice.equals("scissors") && p2choice.equals("rock")){
      setNumberOfLosses();
      this.numberOfGamesPlayed++;
      player2.setNumberOfWins();
    }

  }

   public double getWinPercentage(){
     if(numberOfWins == 0){
       double x = 0.00;
       return x;
     }
     else if(numberOfGamesPlayed >= 1){
     double x = ((double)numberOfWins / (double)numberOfGamesPlayed);
     if(x == 1.0){
       x = 1.00;
     return x;
      }
     else{
     return x;
   }
   }
   else{
     double x = 0.00;
     return x;
   }
  }

  @Override
  public void printWinPercentage(){
    System.out.println(getWinPercentage());
  }

  @Override
  public double getLossPercentage(){
    if(numberOfGamesPlayed >= 1){
    double x = (numberOfLosses / numberOfGamesPlayed);
    if(x == 1.0){
      x = 1.00;
    return x;
     }
    else{
    return x;
  }
  }
  else{
    double x = 0.00;
    return x;
  }
  }

@Override
  public void printLossPercentage(){
    System.out.println(getLossPercentage());
  }

  public void setname(String name){
    name = name;
  }

  public void setNumberOfWins(){
    this.numberOfWins += 1;
  }

  public void setNumberOfTies(){
    this.numberOfTies += 1;
  }

  public void setNumberOfLosses(){
    this.numberOfLosses += 1;
  }

  public String getname(){
    return name;
  }

  public int getNumberOfWins(){
    return numberOfWins;
  }

  public int getNumberOfTies(){
    return numberOfTies;
  }

  public int getNumberOfLosses(){
    return numberOfLosses;
  }


  public void report(){
    System.out.println(name + "  reports:");
    System.out.println("Name: " + name);
    System.out.println("Wins: " + getNumberOfWins());
    System.out.println("Losses: " + getNumberOfLosses());
    System.out.println("Ties: " + getNumberOfTies());

  }


}
