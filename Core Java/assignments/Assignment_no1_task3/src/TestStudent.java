//2. Student
//o frn
//o studentName
//o distanceCovered

class student
{
	int frn;
	String studentname;
	double distanceCovered;
	int getFrn() {
		return frn;
	}
	void setFrn(int frn) {
		this.frn = frn;
	}
	String getStudentname() {
		return studentname;
	}
	void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	double getDistanceCovered() {
		return distanceCovered;
	}
	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}
	void display()
	{
		System.out.println("frn:"+this.frn);
		System.out.println("Studentname:"+this.studentname);
		System.out.println("distanceCovered:"+this.distanceCovered+"km");
	}
}

public class TestStudent {

	public static void main(String[] args) {
		student s1 = new student();
		System.out.println(s1);
		s1.setFrn(1203);
		s1.setStudentname("Yash");
		s1.setDistanceCovered(1.2);
		System.out.println("using getter:");
		
		System.out.println("frn:"+s1.getFrn());
		System.out.println("Student name:"+s1.getStudentname());
		System.out.println("distanceCovered:"+s1.getDistanceCovered()+"km");

		System.out.println("using display:");
		
		s1.display();
	}

}
