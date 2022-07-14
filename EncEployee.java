import java.util.*;
class Emp
  {
    private int id;
    private String name;
    private String dept;
    private int salary;
    void setId(int id)
    {
      this.id=id;
    }
    int getId()
    {
      return this.id;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
     void setDept(String dept)
    {
      this.dept=dept;
    }
    String getDept()
    {
      return this.dept;
    }
     void setSalary(int salary)
    {
      this.salary=salary;
    }
    int getSalary()
    {
      return this.salary;
    }
  }
class EncEmployee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Emp e1=new Emp();
      System.out.println("enter id: ");
      e1.setId(sc.nextInt());
      System.out.println("enter name: ");
      e1.setName(sc.next());
      System.out.println("enter dept: ");
      e1.setDept(sc.next());
      System.out.println("enter salary: ");
      e1.setSalary(sc.nextInt());
System.out.println(e1.getId()+e1.getName()+e1.getDept()+e1.getSalary());
      Emp e2=new Emp();
      System.out.println("enter id: ");
      e2.setId(sc.nextInt());
      System.out.println("enter name: ");
      e2.setName(sc.next());
      System.out.println("enter dept: ");
      e2.setDept(sc.next());
      System.out.println("enter salary: ");
      e2.setSalary(sc.nextInt());
System.out.println(e2.getId()+e2.getName()+e2.getDept()+e2.getSalary());
    }
  }
