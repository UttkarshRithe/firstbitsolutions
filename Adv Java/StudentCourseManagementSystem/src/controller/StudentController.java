package controller;

import java.util.List;

import models.Student;
import service.StudentServiceInterface;
import serviceimplementation.StudentServiceImpl;

public class StudentController {

	StudentServiceInterface ssi = new StudentServiceImpl(); 
	
	public int addStudent(Student std)
	{
		return ssi.insertStudent(std);
	}
	
	
	public int deletestudent(int id)
	{
		 return ssi.removeStudent(id);
	}
	
	
	public List<Student> getAllstudent()
	{
		return ssi.viewStudent();
	}
	
	public Student searchStudent(int id)
	{
		return ssi.searchStudent(id);
	}
	
	public int updateStudentfee(int id,double fee)
	{
		return ssi.updateFeesPaid(id, fee);
	}
	
}
