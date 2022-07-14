/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/
import java.util.Scanner;
class Person { 
//declare age 
int age;
//create setters and getters
public void setAge(int age) {
    this.age = age;
}
int getAge() {
    return this.age;
}
    
}  

class PersonEncapsulation {
    //main method 
    public static void main(String[] args) {
        //Scanner is used to take input form users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int a = sc.nextInt();
        //creating an object
        Person obj = new Person();
        obj.setAge(a);
        System.out.println("Your age : "+obj.getAge());
    }
}




//create Scanner object

//take input from user

// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 

// Output age  

