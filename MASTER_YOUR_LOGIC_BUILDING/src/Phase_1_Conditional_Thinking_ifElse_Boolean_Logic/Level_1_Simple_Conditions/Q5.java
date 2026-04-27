package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||year%400==0)
		{
			System.out.println("Given year is leap");
		}
		else
		{
			System.out.println("Given year is NOT a leapyear");
		}

	}

}
