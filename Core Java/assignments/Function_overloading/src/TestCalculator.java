
class Calculator
{

	//Addition
	void Addition(int a,int b)
	{
		int num1=a;
		int num2=b;
		int sum =num1+num2;
		System.out.println("Addition of two numbers:"+sum);
	}
	void Addition(int a,double b)
	{
		int num1=a;
		double num2=b;
		double sum = num1+num2;
		System.out.println("Addition of two numbers:"+sum);
	}
	void Addition(double a,double b)
	{
		double num1=a;
		double num2=b;
		double sum=num1+num2;
		System.out.println("Addition of two numbers:"+sum);
	}
	void Addition(double a,int b) 
	{
		double num1=a;
		double num2=b;
		double sum = num1+num2;
		System.out.println("Addition of two numbers:"+sum);
	}
	
	//Subtraction
	
	void subtraction(int a,int b)
	{
		int num1=a;
		int num2=b;
		int sub=num1-num2;
		System.out.println("Subtraction of two number is:"+sub);
	}
	void subtraction(int a,double b)
	{
		int num1=a;
		double num2=b;
		double sub = num1-num2;
		System.out.println("subtraction of two numbers is:"+sub);
	}
	void subtraction(double a,double b)
	{
		double num1 =a;
		double num2=b;
		double sub=num1-num2;
		System.out.println("subtraction of two numbers is:"+sub);
	}
	void subtraction(double a,int b)
	{
		double num1=a;
		int num2=b;
		double sub=num1-num2;
		System.out.println("subtraction of two numbers is:"+sub);
	}
	//multiplication
	
	void multiplication(int a,int b)
	{
		int num1=a;
		int num2=b;
		int multi=num1*num2;
		System.out.println("multiplication of two numbers is:"+multi);
	}
	void multiplication(int a,double b)
	{
		int num1=a;
		double num2=b;
		double multi=num1*num2;
		System.out.println("multiplication of two numbers:"+multi);
	}
	void multiplication(double a,double b)
	{
		double num1=a;
		double num2=b;
		double multi=num1*num2;
		System.out.println("multiplication of two numbers:"+multi);
	}
	void multiplication(double a,int b)
	{
		double num1=a;
		double num2=b;
		double multi=num1*num2;
		System.out.println("multiplication of two numbers:"+multi);
	}
	//division
	
	void division(int a,int b)
	{
		int num1=a;
		int num2=b;
		double res=num1/num2;
		System.out.println("division of two numbers:"+res);
	}
	void division(double a,int b)
	{
		double num1=a;
		int num2=b;
		double res=num1*num2;
		System.out.println("division of two numbers:"+res);
	}
	void division(double a,double b)
	{
		double num1=a;
		double num2=b;
		double res= num1/num2;
		System.out.println("division of two numbers:"+res);
	}
	void division(int a,double  b)
	{
		int num1=a;
		double num2=b;
		double res = num1/num2;
		System.out.println("division of two numbers:"+res);
	}
}


public class TestCalculator {

	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		c1.Addition(1, 2);
		c1.Addition(1, 1.5);
		c1.Addition(2.5, 7.3);
		c1.Addition(7.9, 1);
		c1.subtraction(10, 2);
		c1.multiplication(2, 2);
		c1.division(14, 7);
		
		
	}

}
