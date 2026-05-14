package View;

import Controller.EmployeeController;
import Model.*;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    EmployeeController ec;

    public EmployeeView() {
        ec = new EmployeeController(); // manual creation
    }

    public void showOption() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Show All Employees");
            System.out.println("3.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("1.HR  2.Admin  3.SalesManager");
                    int ch = sc.nextInt();

                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Salary:");
                    double salary = sc.nextDouble();

                    Employee e = null;

                    if (ch == 1) {
                        System.out.println("Enter Commission:");
                        double c = sc.nextDouble();
                        e = new HR(id, name, salary, c);
                    }

                    else if (ch == 2) {
                        System.out.println("Enter Allowance:");
                        double a = sc.nextDouble();
                        e = new Admin(id, name, salary, a);
                    }

                    else if (ch == 3) {
                        System.out.println("Enter Incentive:");
                        double i = sc.nextDouble();
                        System.out.println("Enter Target:");
                        int t = sc.nextInt();
                        e = new SalesManager(id, name, salary, i, t);
                    }

                    if (ec.addEmployee(e)) {
                        System.out.println("Employee Added!");
                    } else {
                        System.out.println("Error!");
                    }

                    break;
                }

                case 2: {
                    List<Employee> list = ec.getAllEmployees();

                    for (Employee e : list) {
                        System.out.println("\n" + e);
                    }
                    break;
                }
            }

        } while (choice != 3);
    }
}