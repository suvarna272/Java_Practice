   import java.util.Scanner;
   class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        int n, rem,rev=0;
        System.out.println("Enter n value ");
        int n = sc.nextInt();
        while(n!=0)
        {
         int rem = n%10;
          rev = rev*10+rem;
          n=n/10;
        }
    }
  }