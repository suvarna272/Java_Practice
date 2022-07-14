import java.util.*;
class Student1
  {
    private int rollno;
    private String name;
    void setRollno(int rollno)
    {
      this.rollno = rollno;
    }
    int getRollno()
    {
      return this.rollno;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
  }
    class Details
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          Student1 st=new Student1();
          System.out.println("Enter rollno");
          st.setRollno(sc.nextInt());
          System.out.println("Enter name");
          st.setName(sc.next());
          System.out.println(st.getRollno()+st.getName());
        }
      }  
  










          
        
      
  
