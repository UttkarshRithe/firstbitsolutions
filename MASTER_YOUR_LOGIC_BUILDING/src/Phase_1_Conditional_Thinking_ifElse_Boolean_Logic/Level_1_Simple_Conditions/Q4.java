package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num%5==0 && num%3==0)
		{
			System.out.println("Given number is divisible by 5 and 3");
		}
		else
		{
			System.out.println("Given number is NOT divisible by 5 and 3");

		}
	}

}
