/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/


public class ArrayIndexOutOfBoundsException
  {

    public static void main(String args[])
    {

      //initilize variables in the user input in array
     int [] arr={1,2,3,4,5};
      {
        //print the values given in the user input so that we can get which type of array
        System.out.println(arr[6]);
      }
    }
}