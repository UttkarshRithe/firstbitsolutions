package models;

public class Course {

	int id;
	String cname;
	String duration;
	double fees;
	public Course(int id, String cname, String duration, double fees) {
		super();
		this.id = id;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "id=" + id + ", cname=" + cname + ", duration=" + duration + ", fees=" + fees;
	}
	
	
}
