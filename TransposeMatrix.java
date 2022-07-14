/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;
public class TransposeMatrix {
    
    //Define the main method
    public static void main(String[] args) {
        
        //prompting user to give input from conole
        Scanner sc = new Scanner(System.in);
        
        //Declare and the variables
        int rows, cols, i, j;
        
        //Take input from user to enter rows and column values
        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        cols = sc.nextInt();
        
        //declaring and initializing array
        int matrix[][] = new int[rows][cols];
        int transMatrix[][] = new int[cols][rows];
        
        //for loop to initialize the 2D array 
        for(i = 0; i<rows; i++) {
            for(j = 0; j<cols; j++) {
                System.out.print("Elements  "+"["+(i+1)+","+(j+1)+"]"+" : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        
        //Convert the square matrix into transpose
        for(i = 0; i<rows; i++) {
            for(j = 0; j<cols; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        
        //Print the transpose matrix
        System.out.println("After Transpose Matrix");
        for(i = 0; i<cols; i++) {
            for(j = 0; j<rows; j++) {
                //printing i and j instead of j and i
                System.out.print(transMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}