package models;

public class Student {

	
	int id;
	String name;
	String email;
	String city;
	int age;
	double feesPaid;
	public Student(int id, String name, String email, String city, int age, double feesPaid) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
		this.feesPaid = feesPaid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", age=" + age
				+ ", feesPaid=" + feesPaid;
	}
	
	
}
