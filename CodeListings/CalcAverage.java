import java.util.Scanner;

/**
   This program gets a set of test scores and
   uses the Grader class to calculate the average
   with the lowest score dropped.
   
*/

public class CalcAverage{

   public static void main(String[] args){
   
   int numScores; // to hold the number of scores
   
   //crease a scanner object for keyboard input
   
   Scanner keyboard = new Scanner(System.in);
   
   //Get the number of test scores.
   
   System.out.print("How many test scores do you have? ");
   numScores = keyboard.nextInt();
   
   //create an array to hold the test scores
   
   double[] scores = new double[numScores];
   
   //get the test scores and store them
   //in the scores array
   
   for (int index = 0; index < numScores; index++){
   
   System.out.print("Enter score #" + 
            (index + 1) + ": ");
            
   scores[index] = keyboard.nextDouble();
   
   }
   
   //create a grader object, passing the
   //scores array as an argument to the
   //constructor.
   
   Grader myGrader = new Grader(scores);
   
   //display the adjusted average
   
   System.out.println("Your adjusted average is " +
            myGrader.getAverage());
            
   //display the lowest score
   
   System.out.println("Your lowest test score was " + 
               myGrader.getLowestScore());
   
   
   }


}