import java.util.*;
class minValue
  {
    public static void main (String args[])
    {
     Scanner sc = new Scanner(System.in);
       
      int a[] = new int[5];
        System.out.println("Enter the array elements: ");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();// to read
        }
      int minValue = a [0];
      for(int i=0;i<5;i++)
        {
          if(a[i]<minValue)
            minValue=a[i];
        }
      System.out.println("Smallest element present in given array: " +minValue);
      }
  }

    
  