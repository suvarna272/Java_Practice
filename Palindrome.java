/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {
    //main method
    public static void main(String[] args) {
        //declaring a variable
        String s;
        //Scanner is used to read input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        //initializing a variable
        int len = s.length();
        //using for loop
        for(int i=0;i<len/2;i++) {
            //using if else condition
            if(s.charAt(i)!=s.charAt(len-i-1)) {
                System.out.println("Entered String is not a palindrome");
                break;
            }
            else {
                System.out.println( s+" is a palindrome");
                break;
            }
        }
    }
}

