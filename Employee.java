cd class Employee
  {
    String name;
    int id;
    int salary;
    String dept;
    public static void main(String args[])
    {
      Employee emp1 = new Employee();
      emp1.name = "Suvarna";
      emp1.id = 123;
      emp1.salary =30000;
      emp1.dept = "coding";
     System.out.println(emp1.name+" "+emp1.id+" "+emp1.salary+" "+emp1.dept+" ");
      Employee emp2 = new Employee();
     emp2.name = "vijay";
     emp2.id = 223;
     emp2.salary = 20000;
     emp2.dept = "technical";
     System.out.println(emp2.name+" "+emp2.id+" "+emp2.salary+" "+emp2.dept+" " );
     Employee emp3 = new Employee();
     emp3.name = "srinu";
     emp3.id = 323;
     emp3.salary = 10000;
     emp3.dept = "Communication";
     System.out.println(emp3.name+" "+emp3.id+" "+emp3.salary+" "+emp3.dept+" " );
     
    }
  }
