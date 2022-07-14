import java.util.*; // to import scanner package
 class Ct_test
   {
     public static void main(String args[])
     {
       int count1=0,count2=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of children : ");
       int n = sc.nextInt();
       System.out.println("Enter reg no : ");
       int a[]=new int[n];
       for(int i=0;i<=n;i++)
         {
           if(n%2==0)
           {
             count1++;
           }
           else
           {
             count2++;
           }
         }
       System.out.println(count1+" "+ count2);
     }
   }
  