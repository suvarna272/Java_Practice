/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/
import java.util.Scanner;
import java.lang.*;
//main class
public class SubStringWithoutInbuilt {
    //main method
    public static void main(String[] args) {
        //declaring variables
        String s;
        String ss;
        //Scanner class is used to take input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        s = sc.nextLine();
        System.out.println("Enter a substring: ");
        ss = sc.next();
        boolean result = false;
        //using for loop
        for(int i=0;i<s.length();i++) {
            //using for loop
            for(int j=0;j<ss.length();j++) {
                //using if condition
                if(ss.charAt(j)==s.charAt(i)) {
                    //again using if condition
                    if((j!=ss.length()-1)&&(i!=s.length()-1)) {
                        //using if condition
                        if(ss.charAt(j+1)==s.charAt(i+1)){
                            result = true;
                        }
                    }
                }
            }
        }
        //using if else condition
        if (result==true) {
            System.out.println("word "+ss+" is found");
        }
        else {
            System.out.println("Word "+ss+" is not found");
        }
    }
}
