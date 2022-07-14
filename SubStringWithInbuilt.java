/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
    //main method
    public static void main(String[] args) {
        //Scanner is used to read inpit from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string = ");
        String s = sc.nextLine();
        System.out.println("Enter search string = ");
        String ss = sc.nextLine();
        //using if else condition
        if(s.contains(ss)) {
            System.out.println(ss+" Found");
        }
        else {
            System.out.println(ss+" not found");
        }
    }
}
