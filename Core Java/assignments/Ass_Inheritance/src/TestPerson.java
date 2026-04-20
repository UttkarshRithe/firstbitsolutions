//4. Person Hierarchy
//
//name
//age
//address

class Person
{
	String name;
	int age;
	String address;
	
	Person()
	{
		this.name="not given";
		this.age=0;
		this.address="not given";
	}
	
	Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Address:"+this.address);
	}
}


//Student is-a Person
//
//rollNumber
//course

class Student extends Person
{
	int rollNumber;
	String course;
	
	Student()
	{
		super();
		this.rollNumber=0;
		this.course="not given";
	}
	
	Student(String name,int age,String address,
			int rollNumber,String course)
	{
		super(name,age,address);
		this.rollNumber=rollNumber;
		this.course=course;
	}
	
	void display()
	{
		super.display();
		System.out.println("Roll Number:"+this.rollNumber);
		System.out.println("Course:"+this.course);
	}
}


//Teacher is-a Person
//
//subject
//salary

class Teacher extends Person
{
	String subject;
	double salary;
	
	Teacher()
	{
		super();
		this.subject="not given";
		this.salary=0;
	}
	
	Teacher(String name,int age,String address,
			String subject,double salary)
	{
		super(name,age,address);
		this.subject=subject;
		this.salary=salary;
	}
	
	void display()
	{
		super.display();
		System.out.println("Subject:"+this.subject);
		System.out.println("Salary:"+this.salary);
	}
}


class TestPerson
{
	public static void main(String args[])
	{
		Teacher t1 = new Teacher();
		t1.display();
	}
}