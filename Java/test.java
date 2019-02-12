import java.util.*;

public class test{
  public static void main(String[] args){

int []a = {2, 4, 6, 8};
for(int i = 0; i < a.length; i++)
System.out.println(a[i]);
myFunction(a);
for(int i = 0; i < a.length; i++)
System.out.println(a[i]);
  }

 public static void myFunction(int []x){
   for(int i=0; i< x.length; i++)
   x[i]= 1;
 }
}
