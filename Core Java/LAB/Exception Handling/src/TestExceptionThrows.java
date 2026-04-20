
class InvalidVoterException extends Exception
{
	public String toString()
	{
		return "You are not allow to Vote";
	}
}

class Voter 
{
	int age;

	Voter(int age)
	{
		this.age = age;
	}
	
	void validate() throws InvalidVoterException
	{
		if(age<18)
		{		
				 throw new InvalidVoterException(); 
		}
		else
		{
			System.out.println("you are eligible to vote!!");
		}
	}
	
}



public class TestExceptionThrows {

	public static void main(String[] args) {

		Voter v1 = new Voter(16);
		try {
			v1.validate();
		}catch(InvalidVoterException ive)
		{
			System.out.println(ive.toString());
		}
	}
}
