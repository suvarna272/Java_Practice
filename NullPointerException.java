/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
class Student1
  {
   
    int marks;
    String name;
    String city;
//creating setter methods and getter methods
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
    void setMarks(int marks)
    {
      this.marks=marks;
    }
    int getMarks()
    {
      return marks;
    }
    void setCity(String city)
    {
      this.city=city;
    }
    String getCity()
    {
      return city;
    }
  }
//main class
public class NullPointerException
  {
//main method
    public static void main(String args[])
  {
//creating object for student class and calling its parameters
    Student1 st=new Student1();
    String a=null;
    st.setName(a);
    st.setMarks(100);
    st.setCity("vijayawada");
//printing  name, marks and city in method business logic
    System.out.println("student name is:"+st.getName()+"student marks are: "+st.getMarks()+"student belong to: "+st.getCity());
    //NullPointerException occurs
     System.out.println(a.length());
   
    }
}
