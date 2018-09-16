import java.util.Scanner;
//Class Average defined
public class Average
{
   //Method to handle number format exception
   static int[] ConvertArguments(String[] args) throws NumberFormatException
   {
       //Decalares an array of entered number length
       int[] nums = new int[args.length];
       //Converted the inputted data to integer
       for (int i = 0; i < args.length; ++i)
       {
           nums[i] = Integer.parseInt(args[i]);
       }
       //Returns the number array
       return nums;
   }
   //Prints the arguments entered by the user in command line
   private static void PrintArguments (String[] args)
   {
       for (int i = 0; i < args.length; ++i)
           System.out.println(args[i]);
   }
   //Calculates the average of inputed numbers
   private static double calculateAverage(int nums [])
   {
       double sum = 0.0;
       //Calculates the total
       for (int i = 0; i < nums.length; ++i)
           sum += nums[i];
       //Calculates and returns the average
       return (sum) / (nums.length);
   }
   public static void main(String[] args)
   {
       //Checks for the number of arguments if it is more than zero number of arguments then print the array, converts to integer and calculates the average
       if (args.length > 0)
       {
           PrintArguments(args);
           int[] nums = ConvertArguments(args);
           System.out.println("The average of the numbers is :" + calculateAverage(nums));
       }
       //If zero number of arguments then print message
       else
           System.out.println("No arguments! ");
   }
}