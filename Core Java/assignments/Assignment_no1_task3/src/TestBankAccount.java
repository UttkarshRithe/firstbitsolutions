//8. BankAccount
//o accountNumber
//o holderName
//o currentBalance
//o interestRate

class BankAccount{
	int accountNumber;
	String holderName;
	double currentBalance;
	double interestRate;
	int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	String getHolderName() {
		return holderName;
	}
	void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	double getCurrentBalance() {
		return currentBalance;
	}
	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	double getInterestRate() {
		return interestRate;
	}
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	void display()
	{
		System.out.println("Account number:"+this.accountNumber);
		System.out.println("Holder name:"+this.holderName);
		System.out.println("current Balance:"+this.currentBalance);
		System.out.println("Interest Rate:"+this.interestRate);
	}
}
public class TestBankAccount {

	public static void main(String[] args) {
	BankAccount b1 = new BankAccount();
	System.out.println(b1);
	b1.setAccountNumber(456123);
	b1.setHolderName("Yash");
	b1.setCurrentBalance(25000);
	b1.setInterestRate(5.6);
	
	System.out.println("using getter");
	System.out.println("Account number:"+b1.getAccountNumber());
	System.out.println("HolderName:"+b1.getHolderName());
	System.out.println("Current Balance:"+b1.getCurrentBalance());
	System.out.println("Interrest Rate:"+b1.getInterestRate());
	
	System.out.println("Using display");
	b1.display();
	}

}

