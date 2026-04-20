class Student
{
	int frn;
	String name;
	double distanceCovered;
	static int count=0;
	Student()
	{
		this.frn=101;
		this.name="abc";
		this.distanceCovered=1.2;
		count++;
	}
	Student(int frn,String name,double distanceCovered)
	{
		this.frn=frn;
		this.name=name;
		this.distanceCovered=distanceCovered;
		count++;
	}
	
	void setFrn(int frn)
	{
		this.frn=frn;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setdistanceCovered(double distanceCovered)
	{
		this.distanceCovered=distanceCovered;
	}

	int getFrn()
	{
		return this.frn;
	}
	String getName()
	{
		return this.name;
	}
	double getdistanceCovered()
	{
		return this.distanceCovered;
	}
	
	static int getCount() {
		return count;
	}
	static void setCount(int count) {
		Student.count = count;
	}
	void display()
	{
		System.out.println("frn: "+this.frn);
		System.out.println("name: "+this.name);
		System.out.println("DistanceCovered: "+this.distanceCovered+"km");

	}

}


class PlaceStudent extends Student // step 1: is a realation define krna 
{
	String companyName;
	String designation;
	
	PlaceStudent()
	{
		super();//step2:reuse krna
		this.companyName = "google";
		this.designation = "SDE1";
	}
	
	PlaceStudent(int frn,String name,double distanceCovered,String companyName,String designation)
	{
		super(frn,name,distanceCovered);//step2:reuse krna
		this.companyName=companyName;
		this.designation=designation;
	}

	void setcompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	void setdesignation(String designation)
	{
		this.designation=designation;
	}
	String getcompanyName()
	{
		return this.companyName;
	}
	String getdesignation()
	{
		return this.designation;
	}
	void display()
	{
		super.display();//step 3 : 
		System.out.println("companyName:"+this.companyName);
		System.out.println("designation:"+this.designation);
	}
}





public class Test {

	public static void main(String[] args) {
//		Student s1 = new Student(1,"Pritesh",200);
//		Student s2 = new Student(2,"Uttkarsh",300);
		Student s3 = new Student(3,"Suryakant",500);
		PlaceStudent ps1 = new PlaceStudent();
		ps1.display();
		s3.display();
//		PlaceStudent ps2 = new PlaceStudent(4,"Rani",600,"Wipro","Backend Developer");
		
		System.out.println(Student.getCount());
	}

}
