package Grade;
public class Student_percentage extends Student_marks
  {
    int total_marks;
    public void Percentage()
    {
      float percentage=(total_marks/300)*100;
       System.out.println("percentage "+percentage+"%");
      if (percentage>90)
      System.out.println("Grade A ");
      else if(percentage<90&&percentage<=80)
      System.out.println("Grade B ");
      else if(percentage>70&&percentage<=61)
      System.out.println("Grade C ");
      else
      System.out.println("Grade D ");
      }
  }
