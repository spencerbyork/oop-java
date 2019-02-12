public static <TheType extends Comparable<TheType>>
   TheType tripleMin(TheType item1, TheType item2, TheType item3) {
      TheType minVal = item1; // Holds min item value, init to first item

METHOD GENERIC ^^^^^
OR
CLASS GENERIC ˅˅˅˅˅˅

public class TripleItem <TheType extends Comparable<TheType>> {
   private TheType item1; // Data value 1
   private TheType item2; // Data value 2
   private TheType item3; // Data value 3

   public TripleItem(TheType i1, TheType i2, TheType i3) {
      item1 = i1;
