
public class TestException {

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Answer is:"+a/b);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Do not provide secont argument as zero!!");
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Please enter number not string!!");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Provide atleast two parameters!!");
		}
		finally 
		{
			System.out.println("see you soon!!");
		}
	}

}
