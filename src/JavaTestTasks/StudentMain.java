package JavaTestTasks;


public class StudentMain
{
private int id;
private String name;
private int marks;
private char grade;

 private StudentMain()
{
this.id = 123;
this.name = "JohnSmith";
this.marks = 95;
this.grade = 'A';
}

public StudentMain(int id, String name, int marks, char grade) {
super();
this.id = id;
this.name = name;
this.marks = marks;
this.grade = grade;
}

public void displayDetails()
{
System.out.println(id);
System.out.println(name);
System.out.println(marks);
System.out.println(grade);
}
public void calculateGrade()
{
if(marks>90)
{
System.out.println('A');
}
else if(marks>81&&marks<90)
{
System.out.println('B');
}
else if(marks>71&&marks<80)
{
System.out.println('c');
}
else if(marks>61&&marks<70)
{
System.out.println('D');
}
else if(marks<61)
{
System.out.println('E');
}
}

public static class Student
{
public static void main(String[] args)
{
StudentMain s1 = new StudentMain(283, "Sumanth", 85,'A');

s1.calculateGrade();
StudentMain s2=new StudentMain(1245,"venkat",83,'B');
s2.displayDetails();
s2.calculateGrade();

}
}



}
