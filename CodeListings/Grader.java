/**
   The grader class calculates the average
   of an array of test scores, with the
   lowest score dropped.
*/

public class Grader{

   //the testScores field is a variable
   //that will reference an array
   //of test scores
   
   private double[] testScores;
   
   /**
      Constructor
      @param scoreArray an array of test scores.
   */
   
   public Grader(double[] scoreArray){
   
   //assign the array arugment to 
   //the test scores field.
   
   testScores = scoreArray;
   
   }
   
   /**
      getLowestScore method
      @return The lowest test score.
   */
   
   public double getLowestScore(){
   
   double lowest; //to hold the lowest score
   
   //get the first test score in the array
   lowest = testScores[0];
   
   //step through the rest of the array. when 
   //a value less than lowest is found, assign
   //it to lowest.
   
   for (int index = 1; index < testScores.length; index++){
   
      if (testScores[index] < lowest)
         lowest = testScores[index];
   
      }
   
   return lowest;
   
   }
   /** 
      getAverage method
      @return The average of the test scores
      with the lowest score dropped.
   */
   
   public double getAverage(){
   
      double total = 0; //to hold the score total
      double lowest; //to hold the lowest score
      double average; // to hold the average
      
      // if the array contains less than two test
      //scores, display an error message and set
      //average to 0
      
      if (testScores.length < 2){
      
      System.out.println("ERROR: You must have at " + 
                        "least two test scores!");
      average = 0;
      
      }
      else{
      
         //first, calculate the total of the scores.
         
         for (double score : testScores)
            total += score;
            
         //next, get the lowest score
         
         lowest = getLowestScore();
         
         //subtract the lowest score from the total
         
         total -= lowest;
         
         //get the adjusted average
         
         average = total / (testScores.length - 1);
      
      }
      
      //return the adjusted average.
      
      return average;
   
   }

}