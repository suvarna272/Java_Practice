/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.*;
public class Temperature {
   //Define the main method
   public static void main(String[] args) {
      //prompting user to give input from console
      Scanner sc = new Scanner(System.in);
      //Declare the variables and initialize
      int days, i, j;
      System.out.println("Enter number of days : ");
      days = sc.nextInt();
      int temp[] = new int[days];
      //Take temperature of 7 days as a input from user
      for(i = 0; i < temp.length; i++) {
         System.out.println("Enter the temperature of Day : "+(i+1));
         temp[i] = sc.nextInt();
      }
      float min = (float)temp[0];
      //Calculate the lowest temperature
      for (j = 0; j < temp.length; j++) {  
         //Compare elements of array with min  
         if(temp[j] < min)  
            min = temp[j];
        }  
      //Print the result
      System.out.print("The lowest temperature of the week is : "+min+" celsius");
   }
}