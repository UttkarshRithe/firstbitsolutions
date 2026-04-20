package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class TestEmployee {

	 public static void main(String[] args)
	 {
		Employee[] arr = new Employee[3];
		
		arr[0] = new HR(101,"Yash",25000,5000);
		System.out.println(arr[0].toString());
		System.out.println("Calculated Salary:"+arr[0].calSalary());
		
		System.out.println();
		arr[1] = new Admin(102,"Raj",45000,6000);
		System.out.println(arr[1].toString());
		System.out.println("Calculated Salary:"+arr[1].calSalary());
		
		System.out.println();
		arr[2] = new SalesManager(103, "Om", 32000, 12000, 12);
		System.out.println(arr[2].toString());
		System.out.println("Calculated Salary:"+arr[2].calSalary());
	 }
}
