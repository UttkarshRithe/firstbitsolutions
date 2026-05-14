package dao;

import java.util.List;

import models.Student;

public interface StudentDAOInterface {

	public int addStudent(Student s);
	List<Student>getAllStudent();
	Student searchById(int id);
	int updateFees(int id,double fees);
	int deleteStudent(int id);
	
}
