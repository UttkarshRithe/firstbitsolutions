package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempearture ");
		int temp=sc.nextInt();
		if(temp>=40)
		{
			System.out.println("its too Hot!!");
		}
		else if(temp>=25 && temp<40)
		{
			System.out.println("Its Warm!!");
		}
		else
		{
			System.out.println("Its Cold outside!!");
		}

	}

}
