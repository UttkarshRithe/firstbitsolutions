import java.util.Scanner;

abstract class InsurancePolicy
{
	String policyHolderName;
	double basePremium;
	
	
	InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}

	abstract double calculatePremium();
	
	void printPolicyDetails()
	{
	    System.out.println("----- Insurance Policy Details -----");
	    System.out.println("Policy Holder Name : " + this.policyHolderName);
	    System.out.println("Base Premium       : " + this.basePremium);
	    System.out.println("Final Premium      : " + this.calculatePremium());
	}
}//class InsurancePolicy ends here

class CarInsurance extends InsurancePolicy
{
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;
	double finalPremium;
	CarInsurance(String policyHolderName, double basePremium,int carAgeInYears,boolean hadAccidentInLastYear,double carValue) 
	{
		super(policyHolderName, basePremium);
		this.carAgeInYears=carAgeInYears;
		this.hadAccidentInLastYear=hadAccidentInLastYear;
		this.carValue=carValue;
	}
	@Override
	double calculatePremium() {
		
		if(this.carAgeInYears<=3)
		{
			finalPremium = this.basePremium+this.basePremium * 0.1;
		}
		else if(this.carAgeInYears>=4 && this.carAgeInYears<=7)
		{
			finalPremium =this.basePremium+this.basePremium * 0.2;
		}
		else
		{
			finalPremium =this.basePremium+this.basePremium * 0.3;
		}
		
		if(hadAccidentInLastYear)
		{
			finalPremium = this.finalPremium+this.finalPremium*0.25;
		}
		else
		{
			finalPremium = this.finalPremium-this.finalPremium*0.1;
		}
		if(this.carValue>1000000)
		{
			finalPremium = this.finalPremium+2000;
		}
		return finalPremium;
	}
}//class Carinsurance Ends here

class HealthInsurance extends InsurancePolicy
{
	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;
	double finalPremium;
	HealthInsurance(String policyHolderName, double basePremium, int age, boolean isSmoker,
			boolean hasPreExistingDisease) {
		super(policyHolderName, basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
	@Override
	double calculatePremium()
	{
		
		if(this.age<30)
		{
			finalPremium = this.basePremium+this.basePremium*0.1;
		}
		else if(age>=30 && age<=45)
		{
			finalPremium = this.basePremium+this.basePremium*0.25;
		}
		else
		{
			finalPremium = this.basePremium+this.basePremium*0.40;
		}
		
		if(this.isSmoker)
		{
			finalPremium = this.finalPremium + this.finalPremium*0.30;
		}
		else
		{
			finalPremium = this.finalPremium - this.finalPremium*0.05;
		}
		
		if(this.hasPreExistingDisease)
		{
			finalPremium = this.finalPremium + this.finalPremium*0.20;
		}
		return finalPremium;
	} 
}
public class TestInsurance {

	public static void main(String[] args) {
		System.out.println("Enter choice:\n1.Car Insurance\n2.Health Insurance");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			{
				System.out.println("Enter Policy Holder Name:");
				String str = sc.next();
				System.out.println("Enter BasePremium:");
				double basePremium=sc.nextDouble();
				System.out.println("Car Age:");
				int age = sc.nextInt();
				System.out.println("Did car have accident last year? (true/false)");
				boolean hadAccident=sc.nextBoolean();
				System.out.println("Enter Car Value:");
				double carValue=sc.nextDouble();
				
				InsurancePolicy i1 = new CarInsurance(str,basePremium, age, hadAccident, carValue);
				i1.printPolicyDetails();
				break;
			}
		case 2:
		{
			System.out.println("Enter Policy Holder Name:");
			String str = sc.next();
			System.out.println("Enter BasePremium:");
			double basePremium=sc.nextDouble();
			System.out.println("Enter age:");
			int age = sc.nextInt();
			System.out.println("is Smoker enter true or false: ");
			boolean isSmoker = sc.nextBoolean();
			System.out.println("hasPreExistingDisease:true or false");
			boolean hasPreExistingDisease=sc.nextBoolean();
			InsurancePolicy i2 = new HealthInsurance(str, basePremium, age, isSmoker, hasPreExistingDisease);
			i2.printPolicyDetails();	
		}	
		}
	}
}
