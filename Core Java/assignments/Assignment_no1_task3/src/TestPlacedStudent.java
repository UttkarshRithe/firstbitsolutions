//3. PlacedStudent
//o frn
//o studentName
//o distanceCovered
//o companyName
//o designation

class PlacedStudent
{
	int frn;
	String studentname;
	double distanceCovered;
	String companyName;
	String designation;
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
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	void display()
	{
		System.out.println("frn:"+this.frn);
		System.out.println("Studentnme:"+this.studentname);
		System.out.println("distanceCovered:"+this.distanceCovered);
		System.out.println("Company Name:"+this.companyName);
		System.out.println("Designation:"+this.designation);
	}
}
public class TestPlacedStudent {

	public static void main(String[] args) {
		PlacedStudent ps1 = new PlacedStudent();
		System.out.println(ps1);
		ps1.setFrn(4512);
		ps1.setStudentname("Yash");
		ps1.setDistanceCovered(78);
		ps1.setCompanyName("TCS");
		ps1.setDesignation("Java Devloper");
		
		System.out.println("using getter");
		
		System.out.println("frn:"+ps1.getFrn());
		System.out.println("Name:"+ps1.getStudentname());
		System.out.println("Distance Covered:"+ps1.distanceCovered+"km");
		System.out.println("Comapany name:"+ps1.getCompanyName());
		System.out.println("Designation:"+ps1.getDesignation());
		
		System.out.println("using display");
		
		ps1.display();

	}

}
