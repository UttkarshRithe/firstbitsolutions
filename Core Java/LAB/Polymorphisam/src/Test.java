class Employee
{
	int id;
	String name;
	double salary;
	Employee()
	{
		this.id=1;
		this.name="Yash";
		this.salary=20000.0;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display ()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
	
}

class Admin extends Employee //step1:is a relation
{
	double allowance;

	Admin()
	{
		super();//step2:reuse 
		this.allowance=5000;
	}
	
	Admin(int id, String name, double salary, double allowance) {
		super(id,name,salary);//step2:reuse
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display()
	{
		super.display();//step3:reuse display from super class
		System.out.println("Allowance:"+this.allowance);
	}
}

class HR extends Employee
{
	double commission;
	
	HR()
	{
		super();
		this.commission=5000;
	}
	
	public HR(int id, String name, double salary, double commission) {
		super(id,name,salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
		super.display();
		System.out.println("commission:"+this.commission);
	}

	
}

class SalesManager extends Employee
{
	double incentive;
	int target;
	
	SalesManager()
	{
		super();
		this.incentive=6000;
		this.target=20;
	}
	
	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
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
		super.display();
		System.out.println("incentive: "+this.incentive);
		System.out.println("target: "+this.target);
	}
}




public class Test {

	public static void main(String[] args) {
		Employee e1;
		e1= new Employee(101,"Sachine",20000);
		e1.display();
		System.out.println();
		e1= new HR(102,"Raj",45000,5000);
		e1.display();
		System.out.println();
		e1 = new Admin(104,"Om",70500,10000);
		e1.display();
		System.out.println();
		e1= new SalesManager(105,"Shivam",60000,2000,20);
		e1.display();

	}

}
