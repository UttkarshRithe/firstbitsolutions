class ElectricityBill
{
	static double rate_per_unit=4.0;
	int customer_id;
	String customer_name;
	double units_consumed;
	
	ElectricityBill() {
		this.customer_id=0;
		this.customer_name="Not Given";
		this.units_consumed=0;
	}
	ElectricityBill(int customer_id, String customer_name, double units_consumed) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.units_consumed = units_consumed;
	}

	static double getRate_per_unit() {
		return rate_per_unit;
	}
	static void setRate_per_unit(double rate_per_unit) {
		ElectricityBill.rate_per_unit = rate_per_unit;
	}
	int getCustomer_id() {
		return customer_id;
	}
	void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	String getCustomer_name() {
		return customer_name;
	}
	void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	double getUnits_consumed() {
		return units_consumed;
	}
	void setUnits_consumed(double units_consumed) {
		this.units_consumed = units_consumed;
	}
	double TotalBillAmount()
	{
		double total_bill_amount = this.units_consumed * rate_per_unit;
		return total_bill_amount; 
	}
	void display()
	{
		System.out.println("customer id:"+this.customer_id);
		System.out.println("customer name:"+this.customer_name);
		System.out.println("Units consumed:"+this.units_consumed);
	}
	
}
public class TestBillCalculation {

	public static void main(String[] args) {
		ElectricityBill e1 = new ElectricityBill(101,"Satish",10.32);
		e1.display();
		System.out.println("Total Bill Amount:"+e1.TotalBillAmount());
		
		

	}

}
