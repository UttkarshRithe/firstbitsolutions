package daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import dao.StudentDAOInterface;
import models.Student;
import util.Dbutil;

public class StudentDAOImplementation implements StudentDAOInterface{
	
	@Override
	public int addStudent(Student s) {
		
		Connection conn=Dbutil.getConnection();
		String query ="insert into student values(?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, s.getId());
			psmt.setString(2,s.getName());
			psmt.setString(3, s.getEmail());
			psmt.setString(4, s.getCity());
			psmt.setInt(5, s.getAge());
			psmt.setDouble(6,s.getFeesPaid());
			
			int rows = psmt.executeUpdate();
			return rows;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
		
		
	}

	@Override
	public List<Student> getAllStudent() {
		Connection conn=Dbutil.getConnection();
		String query ="select * from student";
		ArrayList<Student> studentlist=null;
		
		try {
			PreparedStatement psmt = conn.prepareStatement(query);
			ResultSet res = psmt.executeQuery(query);
			
				while(res.next())
				{
					if(studentlist==null)
						studentlist=new ArrayList<Student>();
					
					Student s = new Student(res.getInt("sid"),
							res.getString("name"),
							res.getString("email"),
							res.getString("city"),
							res.getInt("age"),
							res.getDouble("fee_paid"));
					studentlist.add(s);
				}
				return studentlist;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentlist;
	}

	@Override
	public Student searchById(int id) {
		Connection conn=Dbutil.getConnection();
		String query ="select * from student where sid=?";
		Student s=null; 
		try {
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, id);
			ResultSet res= psmt.executeQuery();
			
			if(res.next())
			{
				
					s= new Student(res.getInt("sid"),
					res.getString("name"),
					res.getString("email"),
					res.getString("city"),
					res.getInt("age"),
					res.getDouble("fee_paid"));
					return s;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public int updateFees(int id, double fees) {
		Connection conn=Dbutil.getConnection();
		String query ="update student set fee_paid=? where sid=?";
		
		try {
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setDouble(1, fees);
			psmt.setInt(2, id);
			
			int res =psmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteStudent(int id) {
		Connection conn=Dbutil.getConnection();
		String query ="delete from student where sid=?";
		
		try {
			
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, id);
			
			int res =psmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

}
