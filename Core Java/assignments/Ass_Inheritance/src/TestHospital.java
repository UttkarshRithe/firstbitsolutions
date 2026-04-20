//5. Hospital Staff Hierarchy
//
//HospitalStaff
//
//staffId
//name
//salary

class HospitalStaff
{
	int staffId;
	String name;
	double salary;
	
	HospitalStaff()
	{
		this.staffId=0;
		this.name="not given";
		this.salary=0;
	}
	
	HospitalStaff(int staffId,String name,double salary)
	{
		this.staffId=staffId;
		this.name=name;
		this.salary=salary;
	}
	
	int getStaffId() {
		return staffId;
	}
	
	void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Staff ID:"+this.staffId);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
}


//Doctor is-a HospitalStaff
//
//specialization
//experienceYears

class Doctor extends HospitalStaff
{
	String specialization;
	int experienceYears;
	
	Doctor()
	{
		super();
		this.specialization="not given";
		this.experienceYears=0;
	}
	
	Doctor(int staffId,String name,double salary,
		   String specialization,int experienceYears)
	{
		super(staffId,name,salary);
		this.specialization=specialization;
		this.experienceYears=experienceYears;
	}
	
	void display()
	{
		super.display();
		System.out.println("Specialization:"+this.specialization);
		System.out.println("Experience Years:"+this.experienceYears);
	}
}


//Nurse is-a HospitalStaff
//
//shift
//wardAssigned

class Nurse extends HospitalStaff
{
	String shift;
	String wardAssigned;
	
	Nurse()
	{
		super();
		this.shift="not given";
		this.wardAssigned="not given";
	}
	
	Nurse(int staffId,String name,double salary,
		  String shift,String wardAssigned)
	{
		super(staffId,name,salary);
		this.shift=shift;
		this.wardAssigned=wardAssigned;
	}
	
	void display()
	{
		super.display();
		System.out.println("Shift:"+this.shift);
		System.out.println("Ward Assigned:"+this.wardAssigned);
	}
}

class TestHospital
{
	  public static void main(String args[]) {
		Doctor d1 = new Doctor();
		d1.display();

	}
}