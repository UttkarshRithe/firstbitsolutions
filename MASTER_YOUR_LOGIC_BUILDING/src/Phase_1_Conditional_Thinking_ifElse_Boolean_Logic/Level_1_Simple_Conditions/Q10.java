package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Character is LowerCase!!");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Character is UpperCase!!");
		}else if(ch>='0' && ch<='9')
		{
			System.out.println("It is Number!!");
			
		}
		else
		{
			System.out.println("It is Special Symbol!!");
		}

	}

}
