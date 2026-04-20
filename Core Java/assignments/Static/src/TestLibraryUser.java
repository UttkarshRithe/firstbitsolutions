class LibraryUser
{
	String userName;
	int daysLate;
	static double fine_per_day=10;
	
	LibraryUser() {
		this.userName="Not given";
		this.daysLate=0;
	}
	LibraryUser(String userName, int daysLate) {
		this.userName = userName;
		this.daysLate = daysLate;
	}
	
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	int getDaysLate() {
		return daysLate;
	}
	void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}
	static double getFine_per_day() {
		return fine_per_day;
	}
	static void setFine_per_day(double fine_per_day) {
		LibraryUser.fine_per_day = fine_per_day;
	}
	void display()
	{
		System.out.println("Name:"+this.userName);
		System.out.println("Late day:"+this.daysLate);
	}
	double TotalFine()
	{
		double Total_fine=this.daysLate*LibraryUser.fine_per_day;
		return Total_fine;
	}
}
public class TestLibraryUser {

	public static void main(String[] args) {
		LibraryUser l1 = new LibraryUser("Yash",10);
		l1.display();
		System.out.println("fine per day:"+LibraryUser.fine_per_day);
		System.out.println("Total fine:"+l1.TotalFine());
	}

}
