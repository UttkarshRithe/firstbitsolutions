package myapp;

import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import models.Student;

public class MainApp {
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
       int choice;
       
       StudentController stdcon = new StudentController();

       do {

           System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
           System.out.println("1. Add Student");
           System.out.println("2. View All Students");
           System.out.println("3. Search Student By ID");
           System.out.println("4. Update Student Fees");
           System.out.println("5. Delete Student");
           System.out.println("6. Exit");

           System.out.print("Enter your choice: ");
           choice = sc.nextInt();

           switch (choice) {

               case 1:
            	   System.out.print("Enter Student ID: ");
            	   int id = sc.nextInt();
            	   sc.nextLine(); // buffer clear

            	   System.out.print("Enter Student Name: ");
            	   String name = sc.nextLine();

            	   System.out.print("Enter Student Email: ");
            	   String email = sc.nextLine();

            	   System.out.print("Enter Student City: ");
            	   String city = sc.nextLine();

            	   System.out.print("Enter Student Age: ");
            	   int age = sc.nextInt();

            	   System.out.print("Enter Fees Paid: ");
            	   double feesPaid = sc.nextDouble();


            	   Student s = new Student(id, name, email, city, age, feesPaid);
            	   int res =stdcon.addStudent(s);
            	   if(res!=0)
            	   {
            		   System.out.println("Stduent is added Successfully!!");
            	   }
            	   else
            	   {
            		   System.out.println("Student not added");
            	   }
               break;

               
               
               case 2:
            	   
                   List<Student> list = stdcon.getAllstudent();
                   if(list==null)
                   {
                	   		System.out.println("Student is Empty");
                   }
                   else
                   {
                	   		System.out.println(list);
                   }
                   break;

               case 3:
                   System.out.print("Enter Student ID: ");
                   int searchId = sc.nextInt();
                   Student std=stdcon.searchStudent(searchId);
                   if(std==null)
                   {
                	   		System.out.println("Student is not present!!");
                   }
                   else
                   {
                	   		System.out.println(std);
                   }
                   break;

               case 4:
                   System.out.print("Enter Student ID: ");
                   int updateId = sc.nextInt();

                   System.out.print("Enter New Fees: ");
                   double newFees = sc.nextDouble();

                   int result=stdcon.updateStudentfee(updateId, newFees);
                   if(result!=0)
                   {
                	   		System.out.println("Student fees Updated!!");	
                   }
                   else
                   {
                	   		System.out.println("Student fees not updated!!");
                   }
              
                   break;

               case 5:
                   System.out.print("Enter Student ID: ");
                   int deleteId = sc.nextInt();
                   int delres=stdcon.deletestudent(deleteId);
                   if(delres!=0)
                   {
                	   		System.out.println("Student fees Deleted!!");	
                   }
                   else
                   {
                	   		System.out.println("Student not deleted!!");
                   } 
                   break;

               case 6:
                   System.out.println("Thank You...");
                   break;

               default:
                   System.out.println("Invalid Choice");
           }

       } while (choice != 6);

       sc.close();
   }
}

