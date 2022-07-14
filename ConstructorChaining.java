/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/

// creating parent class
   class Mike {
      //parent class default constructor
      Mike() {
         this(1, 2);
         System.out.println("parent class default constructor");
      }
      //parent class one arguement constructor
      Mike(int a , int b) {
         System.out.println("parent class one arguement constructor");
      }
   }
   //child class
   class Make extends Mike {
      //child class default constructor
      Make () {
         this("make","mike");
         System.out.println("child class default constructor");
      }
      //child class one arguemnet constructor
      Make(String s, String m) {
         System.out.println("Child class one arguement constructor");
      }
   }
//main class
   public class ConstructorChaining {
      //main method 
      public static void main(String[] args) {
         //creating an object
         Make obj = new Make();
      }
   }
