/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {
    //main method
    public static void main(String[] args) {
        //declaring a variable
        String s;
        //Scanner is used to read input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        s=sc.nextLine();
        //Creating stringbuffer using string
        StringBuffer ss = new StringBuffer(s);
        ss.reverse();
        System.out.println("Entire String: "+ss);
        reverWordInMyString(s);
    }
    static void reverWordInMyString(String s1) {
        //using split method
        String[] word = s1.split(" ");
        String reverseString = "";
        //using for loop
        for(int i=0;i<word.length;i++) {
            String words = word[i];
            String reverseword = "";
            for(int j=words.length()-1; j>=0; j--) {
                reverseword = reverseword+words.charAt(j);
            }
            reverseString = reverseString + reverseword +"";
        }
        System.out.println("reversing entire string: "+reverseString);
    }
}
