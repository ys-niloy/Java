import java.lang.*;


public class Student
{
	private String id;
	private String name;
	private double cgpa;


	public Student()
	{
		System.out.println("Empty constructor");
	}

	public Student(String id, String name, double cgpa)

	{
		System.out.println("Parameterized constructor");
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;

	}

	public void setId(String id)
	{
		this.id=id;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}


	public String getId(String id)
	{
		return id;
	}


	public String getName()
	{
		return name;
	}
	
	public double getCgpa(double cgpa)
	{
		return cgpa;
	}

	
	public void showDetails()
	{
		System.out.println("Student name    : "+name);
		System.out.println("Student id     	: "+id);
		System.out.println("Student CGPA    : "+cgpa);
	}
}