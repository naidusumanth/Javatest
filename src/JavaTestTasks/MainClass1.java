package JavaTestTasks;

class Student
{
	int Studentid;
	String name;
	double examfee;
	public String displayDetails()
	{
		return name;
		
	}
	public double Payfee()
	{
		return examfee;
	}



Student()
{
	this.Studentid=123;
	this.name="smith";
    this.examfee=100.0;
}
	
}
class Dayscholar extends Student{
	double transportfee;
	Dayscholar()
	{
		
		this.transportfee=transportfee;
	}
	
}

class Hostler extends Student{
	double hostelfee;

	Hostler()
	{
		
		this.hostelfee=hostelfee;
	}

public String displayDetails()
{
	System.out.println("name="+name);
	System.out.println("studentid="+Studentid);
	System.out.println("examfee="+examfee);
	return name;
	
}
}
public class MainClass1{
	public static void main(String []args)
	{
	Hostler s1=new Hostler();
		s1.displayDetails();
		
	}
}