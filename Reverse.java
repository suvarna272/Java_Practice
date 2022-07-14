import java.util.Scanner;
class Reverse{
  public static void main(String args[]){
    int n,f=0,l=0;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the digit");
      n=sc.nextInt();
       
    while(n!=0)
      {
        f=n%10;
        l=l*10+f;
        n=n/10;
       
       }
       
       
     System.out.println("reverse digit : " +l);

       
 
}
 
}