/**
The purpose of this program is to pass an array from
the main into another method.
*/
public class CheckpointThirteen{

   public static void main(String[] args){
   
   double[] numbers = new double[100];//declares the array
   
   myMethod(numbers);//passes the array 'numbers' to myMethod
   
   }
   
   public static void myMethod(double[] array){//makes a reference to 'numbers'
   
   System.out.println(array);//prints the array
   
   }

}