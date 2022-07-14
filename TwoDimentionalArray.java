/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;
public class TwoDimentionalArray {
   
   //Define the main method
   public static void main(String[] args) {
      
      //prompting user to give input from console
      Scanner sc = new Scanner(System.in);
      
      //Declare the variables
      int i, j,rows, cols, max;
      
      //Take number of rows and columns from user in two-dimensional array
      System.out.println("Enter number of rows and columns : ");
      rows = sc.nextInt();
      cols = sc.nextInt();
      
      //Declaring and Initializing the 2D array
      int[][] arr = new int[rows][cols];
      for(i = 0; i<rows; i++) {
         for(j = 0; j<cols; j++) {
            System.out.print("Enter arr "+"[ "+i+" ] "+"[ "+j+" ] : ");
            arr[i][j] = sc.nextInt();
         }
         System.out.println();
      }
      
      //assume first element is largest and use for loop to compare the largest element with all the reamaining elements
      max = arr[0][0];
      for(i = 0; i<rows; i++) {
         for(j = 0; j<cols; j++) {
            if(arr[i][j] > max) {
               max = arr[i][j];
            }
         }
      }
      
      //Calcualte the maximum element based on index poistion
      int pos1 = 0;
      int pos2 = 0;
      for(i = 0; i<rows; i++) {
         for(j = 0; j<cols; j++) {
            if(arr[i][j] == max) {
               pos1 = i;
               pos2 = j;
            }
         }
      }
      
      //Print result
      System.out.print("Largest element in array is "+max+" and its index position is arr "+"[ "+pos1+" ]"+"[ "+pos2+" ]");
   }
}