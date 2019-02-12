import java.util.*;

public class Grocery2{
 public static void main (String[] args){
   GroceryItem[] items = new GroceryItem[10];

   for(int i = 0; i<items.length; i++){
     items[i] = new GroceryItem();
     items[i].dataEntry();

   }

System.out.println("");

   for(int i = 0; i <items.length; i++){
      items[i].print();
      System.out.println("");
   }
 }
}
