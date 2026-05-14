package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour:0-24");
		int hour=sc.nextInt();
		
		if(hour>=6 && hour<=12)
		{
			System.out.println("Good Morning!!");
		}
		else if(hour>12 && hour<19)
		{
			System.out.println("Good Evening!!");
		}
		else
		{
			System.out.println("Good Night!!");	
		}

	}

}
