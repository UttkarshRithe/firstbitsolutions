package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Person is eligible for vote!!");
		}
		else
		{
			System.out.println("Person is Not eligible for vote!!");
		}

	}

}
