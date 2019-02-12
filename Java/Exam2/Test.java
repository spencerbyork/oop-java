public class Test{
public static <myType extends Comparable<myType>> void printArray(myType[] x){

for(int i = 0; i<x.length; i++){

System.out.println(x[i]);

}

}

public static void main(String[] args)
 {
    Integer []   i = {1, 2, 3};
    Character [] c = {'a', 'b', 'c'};
    String []    s = {"abc", "defgh"};

     printArray(i);
     printArray(c);
     printArray(s);
 }
}
