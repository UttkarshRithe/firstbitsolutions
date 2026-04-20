import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Student  implements Comparable
{
	int rollno;
	String name;
	int marks;
	Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "rollno=" + rollno + "\nname=" + name + "\nmarks=" + marks;
	}
//	@Override
//	public int compareTo(Object o) {
//		Student s=(Student)o;
//		return	this.rollno-s.rollno;
//		
//	}
//	

	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return s.rollno==this.rollno;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollno;
	}
	
	
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
	
}

public class Test {


	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(new Student(101,"Sachin",100));
		hs.add(new Student(103,"Dhoni",16));
		hs.add(new Student(102,"Virat",85));
		hs.add(new Student(109,"Ruturaj",27));
		hs.add(new Student(107,"Bumrah",45));
		System.out.println(hs);
		
	
		
		if(hs.contains(new Student(107,"Bumrah",45)))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main1(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add(87);
		hs.add(14);
		hs.add(94);
		hs.add(58);
		hs.add(27);
		hs.add(1);
		
		System.out.println(hs);
		
		
	}

}
