import java.util.Scanner;
  class Conditions
    {
      public static void main(String args[])
      {
       int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        age = sc.nextInt();
        if(age>=18)
        {
          System.out.println("You Are eligble for VOTING");
        }
        else
        {
          System.out.println("You are not Eligible for VOTING");
        }
        
      }
    }