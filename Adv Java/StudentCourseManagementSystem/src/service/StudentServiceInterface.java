package service;

import java.util.List;

import models.Student;

public interface StudentServiceInterface {

	
	int insertStudent(Student ref);
	List<Student> viewStudent();
	Student searchStudent(int id);
	int updateFeesPaid(int id,double fees);
	int removeStudent(int id);
	
	
}
