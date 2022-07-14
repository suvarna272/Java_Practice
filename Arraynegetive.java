import java.util.Scanner;
class Arraynegetive
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a[] = new int [5];
      System.out.println("Enter the array elements: ");
      for (int i=0;i<5;i++)
      {
        a[i] = sc.nextInt();
      }
      System.out.println("Array elements: ");
          for (int i=0;i<5;i++)
            {
              if(a[i]<0)
              {
                System.out.println(a[i]);
              }
            }
       
      
      
    }
  }
