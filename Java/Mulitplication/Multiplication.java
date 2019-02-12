import java.util.*;

public class Multiplication{

//*** MAIN FUNCTION

 public static void main (String[] args){
   Scanner scan = new Scanner(System.in);
   boolean size = false;
//take inputs and check to see if they are the correct size
//if they are, move onto the multiply function
//if not, nothing happens
   int firstNum = scan.nextInt();
   if(firstNum<=9999){
     size = true;
   }
   int secondNum = scan.nextInt();
   if(secondNum<=9999 && size){
     size = true;
   }
   else{
     size = false;
   }

   if(size){
     multiply(firstNum, secondNum);
   }
 }

//*** MULTIPLY FUNCTION

 public static void multiply(int a, int b){
//Define needed variables (yes, I probably have too many unused variables)
//I apologize for the confusing variable names
   int answer = a * b;
   String digits = String.valueOf(answer);
   String numA = Integer.toString(a);
   String numB = Integer.toString(b);
   int sizeA = String.valueOf(a).length();
   int sizeB = String.valueOf(b).length();
   List<Character> digitList = new ArrayList<Character>();

//create list of digits to fill the boxes when printing
//define more variables than I really need
int digitOne;
int digitTwo;
int mult;
int remain;
char d = 'a';
char u = 'a';
/*
-for loop to take elemtns of from a character ArrayList and convert to ints
-multiply, then check if the answer is one or two digits
-if one, add a zero in front for printing
-if two, then add each digit to the ArrayList in proper order
*/
for(int i = 0; i < sizeB; i++){
  for(int z = 0; z < sizeA; z++){
    digitOne = Character.getNumericValue(numA.charAt(z));
    digitTwo = Character.getNumericValue(numB.charAt(i));
    mult = digitOne * digitTwo;
    if(mult<10){
      d = (char)(mult +'0');
      digitList.add('0');
      digitList.add(d);
    }
    if(mult>9){
      d = (char)((mult/10)+'0');
      u = (char)((mult%10)+'0');

      digitList.add(d);
      digitList.add(u);
    }
  }
}
//take all the multiply information above and print it using print function
print(a, b, digitList, digits);
}

//*** PRINT FUNCTION

 public static void print(int a, int b, List<Character> c, String answer){
//Define extra variables
//Again, I apologize for the extra use of random variables
   int sizeA = String.valueOf(a).length();
   int sizeB = String.valueOf(b).length();
   int totalSize = sizeA + sizeB;
   List<String> answerList = new ArrayList<String>();
   String numA = Integer.toString(a);
   String numB = Integer.toString(b);
   int countTop = 0;
   int countBottom = 1;
   int countB = 0;
   String temp;
   int answerCount = 0;

//properly format the answer to arraylist for printing in correct order
// add '\' to print in correct order
for(int i = 0; i < answer.length(); i++){
  temp = Character.toString(answer.charAt(i));
  answerList.add(temp);
  answerList.add("/");
}
//if the answer does not contain more digits than the two inputs combined
//then add spaces at the beginning of the array to properly format the answer
while(totalSize != ((answerList.size())/ 2) ){
answerList.add(0," ");
answerList.add(0," ");
}
answerList.add(0," ");

//Now for the actual printing portion of the code
//print the first line according to number of digits in the first input
   System.out.print("+--");
   for(int i = 0; i < sizeA; i++){
     System.out.print("----");
   }
   System.out.println("-+");

//print second line according the same size as input A
   System.out.print("|   ");
   for(int i = 0; i < sizeA; i++){
     System.out.print(numA.charAt(i) + "   ");
   }
   System.out.println("|");

//print the third line
   System.out.print("| ");
   for(int i = 0; i < sizeA; i++){
     System.out.print("+---");
   }
   System.out.println("+ |");

/*
Now for the confusing part...
-print the boxes with the correct information from the arrayList of digits
    -also print input B in the right column
    -print the first portion of the answer in the left column
-countTop is the numerator, which is equal to the tens digit place
-countBottom is the denominator, which is equal to the ones digit place
    -both variables are stored in the same arrayList
        -countTop is the even number place (count by 2's)
        -countBottom is the odd number place (count by 2's)
-answerList containts the correct answer, along with the correct number of spaces and '/'
    -answerCount keeps track of what portion needs to be printed at what time
*/
for(int y = 0; y < sizeB; y++){
System.out.print("|" + answerList.get(answerCount));
for(int i = 0; i < sizeA; i++){
System.out.print("|" + c.get(countTop) + " /");
countTop += 2;
}
System.out.println("|" + " |");
  answerCount++;
System.out.print("| ");
for(int i = 0; i < sizeA; i++){
  System.out.print("| / ");
}
  System.out.println("|" + numB.charAt(countB) + "|");
  countB++;

  System.out.print("|" + answerList.get(answerCount));
  answerCount++;

  for(int i = 0; i < sizeA; i++){
  System.out.print("|/ " + c.get(countBottom));
  countBottom += 2;
  }
  System.out.println("| |");

  System.out.print("| ");
  for(int i = 0; i < sizeA; i++){
    System.out.print("+---");
  }
  System.out.println("+ |");
}

//Properly print the rest of the answer on the bottom line
System.out.print("|");
while(answerCount < (answerList.size() - 1)){
System.out.print(answerList.get(answerCount) + " ");
answerCount++;
}
System.out.println("   |");
answerCount++;

//Finally, print the last line
System.out.print("+--");
for(int i = 0; i < sizeA; i++){
  System.out.print("----");
}
System.out.println("-+");
  }
}
