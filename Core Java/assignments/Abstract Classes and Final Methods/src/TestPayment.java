abstract class Payment
{
	int paymentId;
	double amount;
	String payerName;
	String status;
	
	Payment(int paymentId, double amount, String payerName, String status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = status;
	}

	void printSummary()
	{
		System.out.println("PaymentId:"+this.paymentId);
		System.out.println("Amount:"+this.amount);
		System.out.println("PayerName:"+this.payerName);
		System.out.println("Status:"+this.status);
	}
	
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
	
	final void process()
	{
		if(validate())
		{
			this.deductAmount();
			this.sendNotification();
			this.status="Success";
		}
		else
		{
			this.status="Failed";
		}
		
	}
}//payment class ends here

class CardPayment extends Payment
{
	String cardNumber;
	String cvv;
	
	CardPayment(int paymentId,double amount,String payerName,String status,String cardNumber, String cvv) 
	{
		super(paymentId,amount,payerName,status);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	String getCardNumber() {
		return cardNumber;
	}


	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	String getCvv() {
		return cvv;
	}


	void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	@Override
	void deductAmount() {
		System.out.println("amount deducted successfully by card payment!!");
	}

	@Override
	void sendNotification() {
		System.out.println("notification send by Card Payment successfull!!");
	}

	boolean validate()
	{
		if(cardNumber.length() == 16 && cvv.length() == 3 && amount>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}//card class end here

class UPIPayment extends Payment
{
	String upiId;

	UPIPayment(int paymentId, double amount, String payerName, String status,String upiId) {
		super(paymentId,amount,payerName,status);
		this.upiId = upiId;
	}
	
	String getUpiId() {
		return upiId;
	}

	void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	@Override
	boolean validate() {
		if(upiId.contains("@") && amount >= 1 && amount <= 100000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	void deductAmount() {
		System.out.println("amount deducted successfully by UPI payment!!");
		
	}

	@Override
	void sendNotification() {
		System.out.println("notification send by UPI Payment successfull!!");
		
	}

}//upi class ends here



public class TestPayment {

	public static void main(String[] args) {
	
		Payment p1 = new CardPayment(101,2000,"Yash","Pending","1234567897894561","456");
		p1.process();
		p1.printSummary();
		
		System.out.println();
		
		Payment p2 = new UPIPayment(120,5000,"Raj","Pending","tashrithe@oksbi");
		p2.process();
		p2.printSummary();
		
	}

}
