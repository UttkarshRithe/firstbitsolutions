//
//Classes
//1. Student
//o Attributes: (rollNo, name, percentage)
//2. Employee
//o Attributes: (id, name, annualSalary)
//3. Bank
//o Contains overloaded methods to approve loans

class Bank
{
	void approveLoan(double percentage)
	{
		if(percentage>80)
		{
			System.out.println("Loan Amount: ₹2,00,000");
		}
		else if(percentage>60 && percentage<80)
		{
			System.out.println("Loan Amount: ₹1,00,000");
		}
		else if(percentage>40 && percentage<60)
		{
			System.out.println("Loan Amount: ₹50,000");
		}
		else
		{
			System.out.println("No loan approved");
		}
	}
	
	void approveLoan(int annualSalary)
	{
		if(annualSalary>1200000)
		{
			System.out.println("Loan Amount: ₹7,00,000");
		}
		else if(annualSalary>1000000 && annualSalary<1200000)
		{
			System.out.println("Loan Amount: ₹6,00,000");
		}
		else if(annualSalary>600000 && annualSalary<1000000)
		{
			System.out.println("Loan Amount: ₹5,00,000");
		}
		else if(annualSalary>400000 && annualSalary>600000)
		{
			System.out.println("Loan Amount: ₹4,00,000");
		}
		else 
		{
			System.out.println("No loan approved");
		}
	}
}

class Student
{
	int rollno;
	String name;
	double percentage;
	Student(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getPercentage() {
		return percentage;
	}
	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}

class Employee
{
	int id;
	String name;
	int annualSalary;
	Employee(int id, String name, int annualSalary) {
		super();
		this.id = id;
		this.name = name;
		this.annualSalary = annualSalary;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAnnualSalary() {
		return annualSalary;
	}
	void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
}

public class TestLoanApproval {

	public static void main(String[] args) {
	
		Student s1 = new Student(101,"yash",86);
		Employee e1 = new Employee(109,"Uttkarsh",850000);
		
		Bank b1 = new Bank();
		b1.approveLoan(e1.getAnnualSalary());
		System.out.println(s1.getPercentage());
		
		b1.approveLoan(s1.getPercentage());
		
	}
}
