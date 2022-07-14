import java.util.Scanner;
class ArrayEven
  {
    public static void main (String args[])
    {
      int a[]=new int [5];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array Values: ");
      for (int i=0;i<5;i++)//store the values 
        {
          a[i] = sc.nextInt();
        }
      
      for (int i=0;i<5;i++)
        {
          if (a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
        
    }
  }