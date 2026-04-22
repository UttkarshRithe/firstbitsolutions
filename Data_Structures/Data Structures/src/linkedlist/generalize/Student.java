package linkedlist.generalize;

public class Student implements Comparable {

	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "roll=" + roll + ",name=" + name + ", marks=" + marks+"\n";
	}
	@Override
	public int compareTo(Object o) {
		
		Student s =(Student)o;
		return this.marks-s.marks;
	}
	  @Override
	    public boolean equals(Object obj) {
	        Student s = (Student) obj;
	        return this.roll == s.roll;
	    }
}
