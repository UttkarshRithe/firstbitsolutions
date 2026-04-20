import java.util.Scanner;

abstract class ElectricityBill
{
	String customerName;
	double units;
	ElectricityBill(String customerName, double units) {
		this.customerName = customerName;
		this.units = units;
	}
	abstract double calculateBill();
	final void generateBill()
	{
		double res=this.calculateBill();
		res = res+(res*(0.05));
		res = res+50;
		System.out.println("Final bill amount:"+res);
	}
	void showUsage()
	{
		System.out.println("Customer Name:"+this.customerName);
		System.out.println("Units Consumed:"+this.units);
	}
}

class ResidentialBill extends ElectricityBill
{
	double bill;
	ResidentialBill(String customerName, double units) {
		super(customerName, units);
	
	}
//	@override
	double calculateBill()
	{
		if(this.units>0 && this.units<=100)
		{
			this.bill = this.units*2.5;
		}
		else if(this.units>=101 && this.units<=300)
		{	
			this.bill = (100*2.5)+(this.units-100)*3.5; 
		}
		else
		{
			this.bill = (100 * 2.5) + (200 * 3.5) + (this.units - 300) * 5;
			if(this.units>500)
			{
				this.bill = this.bill+150;
			}
		}
		return this.bill;
	}
}//class ResidentialBill ends here

class CommercialBill extends ElectricityBill
{
	double bill;
	
	CommercialBill(String customerName, double units) {
		super(customerName, units);
		this.bill=0;
	}
	@Override
	double calculateBill() {
		this.bill = this.units*6.5;
		if(this.units>0 && this.units<200)
		{
			this.bill = 1500; 
		}
		else if(units>1000)
		{
			double surcharge = this.bill * 0.08;
			this.bill = this.bill + surcharge;
		}
		return this.bill;
	}
}




public class TestElictricityBill 
{
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("select customer type:\n1.Residential\n2.Commercial");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			{
				System.out.println("Enter Customer name:");
				sc.nextLine();
				String str = sc.nextLine();
				System.out.println("Enter Units Consumed:");
				double units = sc.nextDouble();
				ElectricityBill e1 = new ResidentialBill(str, units);
				e1.showUsage();
				e1.generateBill();
				break;
			}
		case 2:
			{
				System.out.println("Enter Customer name:");
				sc.nextLine();
				String str = sc.nextLine();
				System.out.println("Enter Units Consumed:");
				double units = sc.nextDouble();
				ElectricityBill e1 = new CommercialBill(str, units);
				e1.showUsage();
				e1.generateBill();
				break;
			}
		}	
	}



}
