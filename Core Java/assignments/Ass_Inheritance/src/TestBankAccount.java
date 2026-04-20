//1. Bank Account Hierarchy
//
//BankAccount
//
//accountNumber
//
//accountHolderName
//
//balance

class BankAccount
{
	int accountNumber;
	String Holdername;
	double balance;
	
	
	BankAccount() {
		this.accountNumber=0;
		this.Holdername="not given";
		this.balance=00;
	}

	BankAccount(int accountNumber, String holdername, double balance) {
		this.accountNumber = accountNumber;
		this.Holdername = holdername;
		this.balance = balance;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getHoldername() {
		return Holdername;
	}

	void setHoldername(String holdername) {
		Holdername = holdername;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	void display()
	{
		System.out.println("account number:"+this.accountNumber);
		System.out.println("holder name:"+this.Holdername);
		System.out.println("balance:"+this.balance);
	}
}

//aavingsAccount is-a BankAccount
//
//interestRate

class SavingAccount extends BankAccount
{
	double interestRate;
	SavingAccount()
	{
		super();
		this.interestRate=0;
	}
	SavingAccount(int accountNumber,String holdername,double balance,double interestRate)
	{
		super(accountNumber,holdername,balance);
		this.interestRate=interestRate;
	}
	double getInterestRate() {
		return interestRate;
	}
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	void display()
	{
		super.display();
		System.out.println("InterestRate:"+this.interestRate);
	}
}

//CurrentAccount is-a BankAccount
//
//overdraftLimit

class CurrentAccount extends BankAccount
{
	double overdraftLimit;

	CurrentAccount() {
		super();
		this.overdraftLimit=0;
	}

	CurrentAccount(int accountNumber, String holdername, double balance,double overdraftLimit) {
		super(accountNumber,holdername,balance);
		this.overdraftLimit = overdraftLimit;
	}

	double getOverdraftLimit() {
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	void display()
	{
		super.display();
		System.out.println("overdraftLimit"+this.overdraftLimit);
	}	
}

class TestBankAccount {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount();
		s1.display();

	}

}
