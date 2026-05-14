package DAO;

import Model.*;
import java.io.*;
import java.util.*;

public class EmployeeDAO {

    String FILE = "employees.txt";

    public boolean addEmployee(Employee e) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true));

            String record = "";

            if (e instanceof HR) {
                HR hr = (HR) e;
                record = "HR," + hr.getEmployeeId() + "," + hr.getEmployeeName() + "," +
                        hr.getSalary() + "," + hr.getCommission();
            }

            else if (e instanceof Admin) {
                Admin ad = (Admin) e;
                record = "ADMIN," + ad.getEmployeeId() + "," + ad.getEmployeeName() + "," +
                        ad.getSalary() + "," + ad.getAllowance();
            }

            else if (e instanceof SalesManager) {
                SalesManager sm = (SalesManager) e;
                record = "SALES," + sm.getEmployeeId() + "," + sm.getEmployeeName() + "," +
                        sm.getSalary() + "," + sm.getIncentive() + "," + sm.getTarget();
            }

            bw.write(record);
            bw.newLine();
            bw.close();

            return true;

        } catch (Exception e1) {
            return false;
        }
    }

    public List<Employee> getAllEmployees() {

        List<Employee> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE));
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[0].equals("HR")) {
                    list.add(new HR(
                            Integer.parseInt(data[1]),
                            data[2],
                            Double.parseDouble(data[3]),
                            Double.parseDouble(data[4])
                    ));
                }

                else if (data[0].equals("ADMIN")) {
                    list.add(new Admin(
                            Integer.parseInt(data[1]),
                            data[2],
                            Double.parseDouble(data[3]),
                            Double.parseDouble(data[4])
                    ));
                }

                else if (data[0].equals("SALES")) {
                    list.add(new SalesManager(
                            Integer.parseInt(data[1]),
                            data[2],
                            Double.parseDouble(data[3]),
                            Double.parseDouble(data[4]),
                            Integer.parseInt(data[5])
                    ));
                }
            }

            br.close();

        } catch (Exception e) {
        }

        return list;
    }
}