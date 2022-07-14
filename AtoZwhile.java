//importing the Scanner class
  import java.util.Scanner;
//Positive class
  class AtoZwhile
  {
  //main method
     public static void main(String[] args) 
    {
    //Associating Scanner class
      Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
      char a = sc.next().charAt(0);
      char ch = 'a';
      while(ch <= 'Z') 
     {
       System.out.println(ch);
       ch++;
     }
   }
  }