import java.util.*;
class Person{
  String name;
  int ID;
  int age;
}
class Student extends Person{
  String branch;
  void study()
  {
    System.out.println("Studying");
  }
}
class Employe extends Person{
  int salary;
  void work(){
    System.out.println("Working")
  }
}
class Faculty extends Employe{
  String teach_sub;
  void teaching(){
    System.out.println("Teaching Subject");
  }
}
class Staff extends Employe{
  void nonteach(){
    System.out.println("Non teaching");
  }
}
class Graduate extends Student{
  String course;
}
class Postgraduate extends Student{
  String subject;
}
class 