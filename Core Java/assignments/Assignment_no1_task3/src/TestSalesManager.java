//SalesManager
//o id
//o name
//o salary
//o incentive
//o target

class SalesManager
{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
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
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("incentive:"+this.incentive);
		System.out.println("target:"+this.target);
	}
}
public class TestSalesManager {

	public static void main(String[] args) {
		SalesManager sm1 = new SalesManager();
		System.out.println(sm1);
		sm1.setId(566);
		sm1.setName("xuz");
		sm1.setSalary(45200);
		sm1.setIncentive(2000);
		sm1.setTarget(10);
		
		System.out.println("using getters:");
		
		System.out.println("id:"+sm1.getId());
		System.out.println("name:"+sm1.getName());
		System.out.println("salary:"+sm1.getSalary());
		System.out.println("incentive:"+sm1.getIncentive());
		System.out.println("target:"+sm1.getTarget());
		System.out.println("Using display");
		 
		sm1.display();
	}

}
