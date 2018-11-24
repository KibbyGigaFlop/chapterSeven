/**
This program will accept an array as an argument
then store 0 in each element, also
displaying the array.
*/

public class CheckpointFourteen{

   public static void main(String[] args){
   
   int[] zeros = new int[5];
   
   zero(zeros);//passes 'zeros' to the zero method
   
   }
   
   private static void zero(int[] array){//makes reference of 'zeros'
   
      for (int index = 0; index < array.length; index++){
      
         int printNum = 0;
         array[index] = printNum + 0;
         
      System.out.print(array[index] + " ");
      }
      
      
   
   }

}