//HR
//o id
//o name
//o salary
//o commission
class HR
{
	int id;
	String name;
	double salary;
	double commission;
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
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("commosiion:"+this.commission);
	}
}
public class TestHR {

	public static void main(String[] args) {
		HR h1 = new HR();
		System.out.println(h1);
		h1.setId(632);
		h1.setName("Yash");
		h1.setSalary(7845);
		h1.setCommission(2000);
		System.out.println("Using getters:");
		
		System.out.println("id:"+h1.getId());
		System.out.println("name:"+h1.getName());
		System.out.println("Salary:"+h1.getSalary());
		System.out.println("Commision:"+h1.getCommission());
		
		System.out.println("Using display:");
		
		h1.display();
	}
}
