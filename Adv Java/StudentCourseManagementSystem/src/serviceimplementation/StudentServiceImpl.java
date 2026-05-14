package serviceimplementation;

import java.util.List;

import dao.StudentDAOInterface;
import daoimplementation.StudentDAOImplementation;
import models.Student;
import service.StudentServiceInterface;

public class StudentServiceImpl implements StudentServiceInterface {

	StudentDAOInterface StudentDaointerface=new StudentDAOImplementation();
	
	@Override
	public int insertStudent(Student ref) {
		
		if(ref.getAge()<18)
		{
			System.out.println("Studnt is not added as age is below 18!!");
			return 0;
		}
		else
		{
			return StudentDaointerface.addStudent(ref);
		}
	}

	@Override
	public List<Student> viewStudent() {
		return StudentDaointerface.getAllStudent();
		
	}

	@Override
	public Student searchStudent(int id) {
		return StudentDaointerface.searchById(id);
		
	}

	@Override
	public int updateFeesPaid(int id, double fees) {
		return StudentDaointerface.updateFees(id, fees);		
	}

	@Override
	public int removeStudent(int id) {
		return StudentDaointerface.deleteStudent(id);
		
	}

}
