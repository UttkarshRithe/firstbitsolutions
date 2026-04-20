package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

class Employee implements Comparable
{
	int id;
	String name;
	double salary;
	
	Employee() {
		this.id=0;
		this.name="Not given";
		this.salary=00;
	}
	Employee(int id, String name, double salary) {
		super();
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	public boolean equals(Object obj)
//	{
//		Employee e =(Employee)obj;
//		if(this.id==e.id)
//		{
//			System.out.println(this.id);
//			return true;
//		}
//		else
//			return false;
//	}
	
@Override
public int compareTo(Object o) {
	Employee e=(Employee)o;
	return this.id-e.id;
	}

}

public class TestArrayListAndLinkedlist {
	
	
	public static void main1(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		
		System.out.println("before Sorting:");
		System.out.println(l1);
		System.out.println("After Sorting");
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, 1));
		
	}
	

	public static void main2(String[] args) {
		
		Employee e1 = new Employee(101,"Raj",12000);
		Employee e2 = new Employee(103,"Tejas",15000);
		Employee e3 = new Employee(102,"Pranav",18000);
		
		ArrayList a2 = new ArrayList();
		a2.add(e1);
		a2.add(e2);
		a2.add(e3);
		
		System.out.println(a2);//
		
		if(a2.contains(new Employee(102,"Tejas",15000)))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Raj",12000);
		Employee e2 = new Employee(103,"Tejas",15000);
		Employee e3 = new Employee(102,"Pranav",18000);
		
		ArrayList a2 = new ArrayList();
		a2.add(e1);
		a2.add(e2);
		a2.add(e3);
		
		System.out.println("before Sorting:"+a2);
		Collections.sort(a2);
		System.out.println("After Sorting:"+a2);
		
		
		
	}
}
