import java.util.Scanner;
class Sum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Two Numbers");
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println(x+""+y);
      int sum = x+y;
      System.out.println("The Sum Is: " + sum);
      }
  }