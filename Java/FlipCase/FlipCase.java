import java.util.*;

public class FlipCase {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);


      String stop = "stop";
      String x = scan.nextLine();
      String temp = x.toLowerCase();

while(!temp.equals(stop))
{
  String y = "";
      for(int i = 0; i < x.length(); i++)
      {
        char z = x.charAt(i);
        if((z) == (Character.toUpperCase(z)))
        {
          y += (Character.toLowerCase(z));
        }

      else if((z) == (Character.toLowerCase(z)))
      {
        y += (Character.toUpperCase(z));
      }
      else
      {
        y += (z);
      }
    }
System.out.println(y);
x = scan.nextLine();
temp = x.toLowerCase();
}
    }
}
