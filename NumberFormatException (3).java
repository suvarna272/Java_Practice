/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/


import java.util.Scanner;
class NumberFormatException    //main class
{
 
//initializing variables//
  int test(int a,int b)
  {
     return (a+b);
  }

public static void main(String args[])  //main method
  {

    Scanner sc=new Scanner(System.in);   //scanner class

    NumberFormatException n=new NumberFormatException ();   //object
   
    System.out.println("enter a value");
    String y=sc.next();                     //print variables
    System.out.println("enter b value");
    String z=sc.next();
   
// using parse method we can Integer.parse  eg:Integer parseInt(string)
   
    int g=Integer.parseInt(z);
    int h=Integer.parseInt(y);

    //print result
    System.out.println("addition is:"+n.test(g,h));
  }
   
}
