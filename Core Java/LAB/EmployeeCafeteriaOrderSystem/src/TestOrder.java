import java.util.LinkedList;

class Employee
{
	int employeeId;
	String employeeName;
	
	
	Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Override
    public String toString() {
        return employeeId + " " + employeeName;
    }
}


class Cafeteria
{
	LinkedList l1 = new LinkedList();
	void Takeorders(Employee e)
	{
		l1.addLast(e);
	}
	
	void serveOrders() {
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("Serving"+(i+1)+":" + l1.get(i));
        }
		
	}
}


public class TestOrder {

	public static void main(String[] args) {
	
		
		Employee e1 = new Employee(101,"Yash");
		Employee e2 = new Employee(102,"Pranav");
		Employee e3 = new Employee(103,"Pritish");
		
		Cafeteria c1 = new Cafeteria();
		
		c1.Takeorders(e1);
		c1.Takeorders(e2);
		c1.Takeorders(e3);
		
		
		c1.serveOrders();
	}

}
