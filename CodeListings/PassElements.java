/**
   This program demonstrates passing individual array
   as arguments to a method.
*/

public class PassElements {

   public static void main(String[] args){
   
      int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
      
      for (int index = 0; index < numbers.length; index++){
      
         showValue(numbers[index]);
      }
   
   }
   
   /**
      The showValue method displays its argument.
      @param n Thevalue to display.
   */
   
   public static void showValue(int n){
   
      System.out.print(n + " ");
   
   }

}