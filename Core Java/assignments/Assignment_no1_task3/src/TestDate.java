//
//Date
//o day
//o month
//o year
//o dow

class Date
{
	int day;
	int month;
	int year;
	String dow;
	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		this.month = month;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getDow() {
		return dow;
	}
	void setDow(String dow) {
		this.dow = dow;
	}
	void display()
	{
		System.out.println("Day:"+this.day);
		System.out.println("month :"+this.month);
		System.out.println("Year:"+this.year);
		System.out.println("Day of week:"+this.dow);
	}
}


class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		d1.setDay(10);
		d1.setMonth(2);
		d1.setYear(2026);
		d1.setDow("Mon");
		
		System.out.println("Using getters");
		System.out.println("Day:"+d1.getDay());
		System.out.println("Month:"+d1.getMonth());
		System.out.println("Year:"+d1.getYear());
		System.out.println("Day of week:"+d1.getDow());
		
		System.out.println("\n");
		System.out.println("using display");
		
		d1.display();
		
	}

}
