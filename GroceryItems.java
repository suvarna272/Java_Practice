/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;
public class GroceryItems {
   
   //Define the main method
   public static void main(String[] args) {
      
      //prompting user to give input from console
      Scanner sc = new Scanner(System.in);
      
      //Declare variables
      float max;
      int n, i;
      
      //Take the 10 different expenses price
      System.out.print("Enter number of grocery items : ");
      n = sc.nextInt();
      
      //Initializing array of grocerie's prices
      System.out.println("Enter the prices of "+n+" grocery items : ");
      float items[] = new float[n];
      
      //The 10 different expenses price using for loop
      for(i = 0; i < n; i++) {
         items[i] = sc.nextFloat();
      }
      
      //Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
      max = 0;
      for(i = 0; i<items.length; i++) {
         if(items[i] > max) {
            max = items[i];
         }
      }
      //Print the result
      System.out.print("The highest price you incurred is "+max);
   }
}