import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;
	
	Employee()
	{
		this.id=0;
		this.name="Not Given";
		this.salary=0.00;
	}
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee arr[] = new Employee[3];
		arr[0]=new Employee(103,"Raj",14000);
		arr[1]=new Employee(109,"Yash",20000);
		arr[2]=new Employee(102,"Saumitra",12000);
		
		for (int i = 0; i < arr.length; i++) {
				arr[i].display();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of employee you want to search:");
		int n = sc.nextInt();
		int flag =0;
		for (int i = 0; i < arr.length; i++) {
			
			if(n==arr[i].id)
			{
				System.out.println("Employee found at "+i+" index");
				flag =1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Employee not found with given id");
		}
		
	}

}
