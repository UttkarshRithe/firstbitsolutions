//7. Admin
//o id
//o name
//o salary
//o allowance

class Admin
{
	int id;
	String name;
	double salary;
	double allowance;
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
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("allowance:"+this.allowance);
	}
}
public class TestAdmin {

	public static void main(String[] args) {
		Admin a1 = new Admin();
		System.out.println(a1);
		a1.setId(1);
		a1.setName("Yash");
		a1.setSalary(20000);
		a1.setAllowance(5000);
		
		System.out.println("using getters");
		
		System.out.println("id:"+a1.getId());
		System.out.println("name:"+a1.getName());
		System.out.println("salary:"+a1.getSalary());
		System.out.println("allowance:"+a1.getAllowance());
		
		System.out.println("using display");
		
		a1.display();
	}
}
