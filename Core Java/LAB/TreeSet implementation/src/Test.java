import java.util.TreeSet;
class Employee implements Comparable
{
	int rollno;
	String name;
	int marks;
	Employee(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "rollno=" + rollno + "\nname=" + name + "\nmarks=" + marks;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return	this.rollno-e.rollno;
		
	}
	
}
public class Test {
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		
		t1.add(new Employee(101,"Sachin",100));
		t1.add(new Employee(103,"Dhoni",16));
		t1.add(new Employee(102,"Virat",85));
		t1.add(new Employee(109,"Ruturaj",27));
		t1.add(new Employee(107,"Bumrah",45));
		
		
		System.out.println(t1);
		
		if(t1.contains(new Employee(101,"Sachin",100)))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}
	
	
	public static void main1(String[] args)
	{
		TreeSet t1 = new TreeSet();
		
		t1.add(100);
		t1.add(109);
		t1.add(7);
		t1.add(48);
		t1.add(130);
		t1.add(28);
		t1.add(6);
		t1.add(300);
		t1.add(125);
		
		System.out.println(t1);
	}
}
