import java.util.Scanner;
class Question
  {
    int n;
    int find type(int n)
    {
      this.n=n;
      int sum=0;
      for(int i=1;i<n;i++)
        {
          if(n%==0)
          {
            sum=sum+i;
          }
        }
      if(sum==n)
        
      {
       return 0;
        
      }
      else if(sum>n)
      {
       return -1; 
      }
      else
      {
      return 1; 
      }
     
    }
  
  }
class Question2
  {
    public static void main(String args[])
    {
    NumberType a = new NumberType();
    Scanner sc = new Scanner(System.in);
      int z=a.findtype(sc.nextInt());
      if(z==-1);
      
      {
        System.out.println("is an abundent number");
      }
  }