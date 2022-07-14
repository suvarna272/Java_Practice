/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {
    //main method
    public static void main(String[] args) {
        //declaring a variable
        int num;
        //Scanner is used to read input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer = ");
        num = sc.nextInt();
        //converting integer to String
        String s = Integer.toString(num);
        //using inbuilt function to print index position
        System.out.println("char at index position 2 = "+s.charAt(2));
        
    }
}
