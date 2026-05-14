package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.EmployeeController;
import model.Employee;

public class Main {

	public static void main(String[] args) throws SQLException {

		      Scanner sc = new Scanner(System.in);
		      
		      EmployeeController ec = new EmployeeController();

		        int choice;

		        do 
		        {
		            System.out.println("\n===== Employee Management System =====");
		            System.out.println("1. Add Employee");
		            System.out.println("2. View Employee");
		            System.out.println("3. Update Employee");
		            System.out.println("4. Delete Employee");
		            System.out.println("5. Exit");

		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch(choice) 
		            {
		                case 1:
		                    System.out.println("Enter id:");
		                    int id=sc.nextInt();
		                    System.out.println("Enter name:");
		                    String name =sc.next();
		                    System.out.println("Enter Salary:");
		                    double salary=sc.nextDouble();
		                    Employee emp = new Employee(id, name, salary);
		                    if(ec.addEmployee(emp)>0)
		                    {
		                    		System.out.println("Employee Added Successfully!!");
		                    }
		                    else
		                    {
		                    		System.out.println("Employe Not Added!!");
		                    }
		                    break;

		                case 2:
		                		ArrayList emplist =ec.viewAllEmployee();
		                		System.out.println(emplist);
		                    break;

		                case 3:
		                    System.out.println("Enter id to update employee:");
		                    int eid = sc.nextInt();
		                    ec.updateEmployee(eid);
		                    break;

		                case 4:
		                    System.out.println("Delete Employee Code Here");
		                    break;

		                case 5:
		                    System.out.println("Exiting Program...");
		                    break;

		                default:
		                    System.out.println("Invalid Choice!");
		            }

		        } while(choice != 5);

		        sc.close();
		    }

}