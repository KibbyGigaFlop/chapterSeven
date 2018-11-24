import javax.swing.JOptionPane;

/**
   This program gathers sales amounts for the week.
   It uses the SalesData class to display the total,
   average, highest, and lowest sales amounts.
*/

public class Sales{

   public static void main(String[] args){
   
   final int ONE_WEEK = 7; //Number of elements
   
   //Create an array to hold the sales amount for a week.
   
   double[] sales = new double[ONE_WEEK];
   
   //get the week's sales figures
   
   getValues(sales);
   
   //Create a SalesData object, initializes
   //witht he week's sales figures.
   
   SalesData week = new SalesData(sales);
   
   //display the total, average, highest and lowest
   //sales amounts for the week.
   
   JOptionPane.showMessageDialog(null, 
      String.format("The total sales were $%,.2f\n" +
                  "The average sales were $%,.2f\n" +
                  "The highest sales were $%,.2f\n" +
                  "The lowest sales were $%,.2f",
                  week.getTotal(),
                  week.getAverage(),
                  week.getHighest(),
                  week.getLowest()));
      System.exit(0);

   }
   
   /**
      The getValues method asks the user to enter sales
      amounts for each element of an array.
      @param array The array to store the values in.
   */
   
   private static void getValues (double[] array){
   
   String input; //to hold user input
   
   //get sales for each day of the week
   
   for (int i = 0; i < array.length; i++){
   
      input = JOptionPane.showInputDialog("Enter the sales for day " + 
                                    (i + 1) + ".");
      array[i] = Double.parseDouble(input);
   
      }
   
   }

}