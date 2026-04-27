package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num =sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		sc.close();
	}

}
