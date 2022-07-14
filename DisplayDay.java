/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay {
  //main method
  public static void main(String[] args) {
    //Use the scanner class to provide input at execution time using scanner object
    Scanner sc = new Scanner(System.in);
    //declaring and initializing variables
    System.out.print("Sample Input from 1 to 7 : ");
    int day = sc.nextInt();
    //Declare switch case and check the input value to print the day entered by the user
    switch(day) {
      case 1:
        //Switch case to print Monday
        System.out.println("Monday");
        break;
      case 2:
        //switch case to print Tuesday
        System.out.println("Tuesday");
        break;
      case 3:
        //switch case to print Wednesday
        System.out.println("Wednesday");
        break;
      case 4:
        //switch case to print Thursday
        System.out.println("Thursday");
        break;
      case 5:
        //switch case to print Friday
        System.out.println("Friday");
        break;
      case 6:
        //switch case to print Saturday
        System.out.println("Saturday");
        break;
      case 7:
        //switch case to print Sunday
        System.out.println("Sunday");
        break;
      default:
      //Default statement
        System.out.println("Invalid Input!");
        break;
    }
  }
  
}