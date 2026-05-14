package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_3;

import java.util.Scanner;


public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit Number:");
		int num=sc.nextInt();
		int x,y,z;
		z=num%10;
		num=num/10;
		y=num%10;
		num=num/10;
		x=num%10;
		
		if(y>z)
		{
			if(y>x)
			{
				System.out.println("middle element is greater!!");
			}
			else
			{
				System.out.println("Middle element is greater than 3rd digit and less than 1st digit");
			}
		}
		else if(y<z)
		{
			if(y<x)
			{
				System.out.println("middle element is smaller!!");
			}
			else
			{
				System.out.println("middle is less than 3 digit and greater than 1st digit");
			}
		}
		else
		{
			System.out.println("Neither small nor greater!!");
		}
		
	}

}
