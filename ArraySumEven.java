import java.util.Scanner;
class arraySumEven
  {
    public static void main (String args[])
    {
      Scanner sc = new Scanner(System.in);
      int sum=0;
      int a[] = new int [6];
      System.out.println("Enter the array elements: ");
      for (int i=0;i<6;i++)
        {
          a[i] = sc.nextInt();// to read
        }
      for(int i=0;i<6;i++)
        {
          if(a[i]%2==0)
          {
            sum=sum+a[i];
            
          }
          System.out.println(sum);
        }
        
    }
  }