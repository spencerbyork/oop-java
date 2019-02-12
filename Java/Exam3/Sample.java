import java.util.Random;

public class Sample
{
    public static void main(String[] args)
    {
          String p1name = "Player 1";
String p2name = "Player 2";

Player p1 = new Player(p1name);
Player p2 = new Player(p2name);

p1.playOpponent(p2, "rock", "scissors");
p1.playOpponent(p2, "paper", "paper");
p1.playOpponent(p2, "paper", "rock");
p1.playOpponent(p2, "scissors", "rock");

System.out.println(p1.getWinPercentage());
System.out.println(p1.getNumberOfTies());
    }
}
