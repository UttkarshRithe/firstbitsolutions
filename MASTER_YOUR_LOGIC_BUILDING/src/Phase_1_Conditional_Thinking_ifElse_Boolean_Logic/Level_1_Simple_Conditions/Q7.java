package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		System.out.println("enter num3:");
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("num1 is greater!!");
			}
			else
			{
				System.out.println("num3 is greater!!");
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("num2 is greater!!");
			}
			else
			{
				System.out.println("num3 is greater!!");
			}
		}

	}

}
