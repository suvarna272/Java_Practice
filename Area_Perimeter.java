import java.util.Scanner;
public class Area_Perimeter
  {
    public static void main(String args[])
    {
      int l,b,area,perimeter;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Length of rectangle:");
      l = s.nextInt();
      System.out.println("Enter breadth of rectangle:");
      b = s.nextInt();
      perimeter = 2 * (l + b);
      System.out.println("perimeter of rectangle:"+perimeter);
      area = l * b;
      System.out.println("area of rectangle:"+area);
      
    }
  }