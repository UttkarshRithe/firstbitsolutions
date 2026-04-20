//4. Employee
//o id
//o name
//o salary

class Employee
{
	int id;
	String name;
	double salary;
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
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.setId(2);
		e1.setName("Yash");
		e1.setSalary(15000);
		System.out.println("using getters");
		
		System.out.println("id:"+e1.getId());
		System.out.println("name:"+e1.getName());
		System.out.println("salary:"+e1.getSalary());
		
		System.out.println("using display");
		e1.display();
	}

}
