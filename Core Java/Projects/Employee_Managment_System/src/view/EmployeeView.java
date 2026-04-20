package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.EmployeeController;
import model.Admin;
import model.Employee;
import model.HR;
import model.SalesMAnager;

public class EmployeeView {
	

	EmployeeController ec;
	public EmployeeView(EmployeeController ec) {
		this.ec=ec;
	}

	public void showOption() {
		
		System.out.println("\n==============================================");
		System.out.println("        WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("==============================================\n");
//		EmployeeController ec= new EmployeeController();
		Scanner sc =new Scanner(System.in);
		int choice ;
		do 
		{
			System.out.println("-> 1. Add Employee");
			System.out.println("-> 2. search Employee by Id");
			System.out.println("-> 3. Update Employee");
			System.out.println("-> 4. Delete Employee");
			System.out.println("-> 5. View all Employee");
			System.out.println("-> 6. Exit");

			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt(); 
			switch(choice)
			{
			
			case 1:
				  {
					  System.out.println("Which Employee Do you want to add:");
					  System.out.println("1.HR");
					  System.out.println("2.Admin");
					  System.out.println("3.SalesManager");
					  System.out.println("Enter Choice:");
					  int em = sc.nextInt();
					  switch(em)
					  {
					  case 1:
					  		{
								  String str = null;
								  do {
								  System.out.println("Enter Id:");
								  int id=sc.nextInt();
								  System.out.println("Enter Name:");
								  sc.nextLine();
								  String name=sc.nextLine();
								  System.out.println("Enter Salary:" );
								  double salary=sc.nextDouble();
								  System.out.println("Enter commision:");
								  double comission=sc.nextDouble();
								  HR hr =new HR(id, name, salary, comission);
								  if(ec.addEmployee(hr))
								  {
									  System.out.println("Employee added Successfully!!");
									  System.out.println("Do you want to add 1 more Hr Employee!!:yes/no");
									  str = sc.next();
								  }
								  else
								  {
									  System.out.println("Employee is not added due to array is full!!");
								  }
								  
								  }
								  while(str.equals("yes"));
								  break;
					  		} 
					  case 2:
					  		{
					  			String str = null;
								  do {
								  System.out.println("Enter Id:");
								  int id=sc.nextInt();
								  System.out.println("Enter Name:");
								  sc.nextLine();
								  String name=sc.nextLine();
								  System.out.println("Enter Salary:" );
								  double salary=sc.nextDouble();
								  System.out.println("Enter Allowance:");
								  double allowance=sc.nextDouble();
								  Admin ad =new Admin(id, name, salary, allowance);
								  if(ec.addEmployee(ad))
								  {
									  System.out.println("Employee added Successfully!!");
									  System.out.println("Do you want to add 1 more Admin Employee!!:yes/no");
									  str = sc.next();
								  }
								  else
								  {
									  System.out.println("Employee is not added due to array is full!!");
								  }
								  
								  }
								  while(str.equals("yes"));
								  break;
					  		}
					  case 3:
					  		{

					  			  String str = null;
								  do {
								  System.out.println("Enter Id:");
								  int id=sc.nextInt();
								  System.out.println("Enter Name:");
								  sc.nextLine();
								  String name=sc.nextLine();
								  System.out.println("Enter Salary:" );
								  double salary=sc.nextDouble();
								  System.out.println("Enter Incentive:");
								  double incentive=sc.nextDouble();
								  System.out.println("Enter Target:");
								  int target = sc.nextInt();
								  SalesMAnager sm =new SalesMAnager(id, name, salary, incentive,target);
								  if(ec.addEmployee(sm))
								  {
									  System.out.println("Employee added Successfully!!");
									  System.out.println("Do you want to add 1 more Admin Employee!!:yes/no");
									  str = sc.next();
								  }
								  else
								  {
									  System.out.println("Employee is not added due to array is full!!");
								  }
								  
								  }
								  while(str.equals("yes"));
								  break;
					  		}
					  		
					  		default:
					  			System.out.println("Enter Valid choice");
					  	}
					  
					  break;
				  }
				  
				  
				case 2:
				{
					System.out.println("Enter Id of employee to search:");
					int id =sc.nextInt();
					Employee res=ec.searchById(id);
					if(res != null)
					{
					    System.out.println(res.toString());
					    System.out.println();
					}
					else
					{
					    System.out.println("Employee not found");
					}
					break;
				}
				
				case 3:
				{
					System.out.println("Select Type of Employee you want to Update:\n1.HR\n2.Admin\n3.SaleaManager");
					int choice1 = sc.nextInt();
					switch(choice1)
					{
						case 1:
						{
								System.out.println("What do you want to update:\n1.employeeName\n2.employeeSalary\n3.comission");
								int choice2 =sc.nextInt();
								System.out.println("Enter EmployeeId:");
								int id =sc.nextInt();
								Employee e =ec.searchById(id);
								if(e == null)
								{
									System.out.println("Employee Does not Exist with id you Mention");
									System.out.println();
								}else if(e instanceof HR)
								{
									if(choice2==1)
									{
										System.out.println("Enter Name:");
										String str=sc.next();
										if(ec.updateName(id, str))
										{
											System.out.println("Employee Name Updated Successfully");
											System.out.println();
										}
										else
										{
											System.out.println("Employee Name Not Updated");
										}
									}
									else if(choice2==2)
									{
										System.out.println("Enter salary you want to update:");
										double salary=sc.nextDouble();
										if(ec.updateSalary(id,salary))
										{
											System.out.println("Salary Updated Successfully!!!");
											System.out.println();
										}else
										{
											System.out.println("Salary is not updated");
										}
									
									}
									else if(choice2==3)
									{
										System.out.println("Enter comission you want to update:");
										double comission=sc.nextDouble();
										if(ec.updateComission(id,comission))
										{
											System.out.println("comission Updated Successfully!!!");
											System.out.println();
										}else
										{
											System.out.println("comission is not updated");
										}
									}
								}
								else
								{
									System.out.println("you mention id is not HR type Employee");
									
								}
							break;
					}
						case 2:
						{
							System.out.println("What do you want to update:\n1.employeeName\n2.employeeSalary\n3.Allowance");
							int choice2 =sc.nextInt();
							System.out.println("Enter EmployeeId:");
							int id =sc.nextInt();
							Employee e =ec.searchById(id);
							if(e == null)
							{
								System.out.println("Employee Does not Exist with id you Mention");
								System.out.println();
							}else if(e instanceof Admin)
							{
								if(choice2==1)
								{
									System.out.println("Enter Name:");
									String str=sc.next();
									if(ec.updateName(id, str))
									{
										System.out.println("Employee Name Updated Successfully");
										System.out.println();
									}
									else
									{
										System.out.println("Employee Name Not Updated");
									}
								}
								else if(choice2==2)
								{
									System.out.println("Enter salary you want to update:");
									double salary=sc.nextDouble();
									if(ec.updateSalary(id,salary))
									{
										System.out.println("Salary Updated Successfully!!!");
										System.out.println();
									}else
									{
										System.out.println("Salary is not updated");
									}
								
								}
								else if(choice2==3)
								{
									System.out.println("Enter Allowance you want to update:");
									double allowance=sc.nextDouble();
									if(ec.updateAllowance(id,allowance))
									{
										System.out.println("allowance Updated Successfully!!!");
										System.out.println();
									}else
									{
										System.out.println("Allowance is not updated");
									}
								}
							}
							else
							{
								System.out.println("you mention id is not HR type Employee");
								
							}
							
							break;
						}
						case 3:
						{
							System.out.println("What do you want to update:\n1.employeeName\n2.employeeSalary\n3.Incentive\n4.target");
							int choice2 =sc.nextInt();
							System.out.println("Enter EmployeeId:");
							int id =sc.nextInt();
							Employee e =ec.searchById(id);
							if(e == null)
							{
								System.out.println("Employee Does not Exist with id you Mention");
								System.out.println();
							}else if(e instanceof SalesMAnager)
							{
								if(choice2==1)
								{
									System.out.println("Enter Name:");
									String str=sc.next();
									if(ec.updateName(id, str))
									{
										System.out.println("Employee Name Updated Successfully");
										System.out.println();
									}
									else
									{
										System.out.println("Employee Name Not Updated");
									}
								}
								else if(choice2==2)
								{
									System.out.println("Enter salary you want to update:");
									double salary=sc.nextDouble();
									if(ec.updateSalary(id,salary))
									{
										System.out.println("Salary Updated Successfully!!!");
										System.out.println();
									}else
									{
										System.out.println("Salary is not updated");
									}
								
								}
								else if(choice2==3)
								{
									System.out.println("Enter Incentive you want to update:");
									double incentive=sc.nextDouble();
									if(ec.updateIncentive(id,incentive))
									{
										System.out.println("Incentive Updated Successfully!!!");
										System.out.println();
									}else
									{
										System.out.println("Incentive is not updated");
									}
								}
								else if(choice2==4)
								{
									System.out.println("Enter Target you want to update:");
									int target=sc.nextInt();
									if(ec.updateTarget(id,target))
									{
										System.out.println("Target Updated Successfully!!!");
										System.out.println();
									}else
									{
										System.out.println("Target is not updated");
									}
								}
							}
							else
							{
								System.out.println("you mention id is not HR type Employee");
								
							}
							break;
						}
					}
					break;
				}
				case 5:
				{
					System.out.println("\n==============================================");
					System.out.println("              ALL EMPLOYEE DETAILS            ");
					System.out.println("==============================================");
					Employee[] empArray;
					empArray = ec.getAllEmployee();
					for(int i = 0; i < empArray.length; i++) {
						
							if(empArray[i]!=null)
							{
								if(empArray[i] instanceof HR)
								{
									HR h = (HR) empArray[i];
									System.out.println(h.toString());
								}
								if(empArray[i] instanceof Admin)
								{
									Admin ad = (Admin) empArray[i];
									System.out.println(ad.toString());
								}
								if(empArray[i] instanceof SalesMAnager)
								{
									SalesMAnager sm = (SalesMAnager) empArray[i];
									System.out.println(sm.toString());
								}
								System.out.println();
							}
			        }
					break;
				}
				default:
		  			System.out.println("Enter Valid choice");
		  			System.out.println();
			}
		}while(choice != 6);
			

	}

}
