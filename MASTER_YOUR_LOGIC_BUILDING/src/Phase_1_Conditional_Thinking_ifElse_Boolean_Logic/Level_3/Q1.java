package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number:");
		int num=sc.nextInt();
		
		int x,y,z;
		
		x=num%10;
		num=num/10;
		y=num%10;
		num=num/10;
		z=num%10;
		
		if(x!=y && x!=z && y!=z)
		{
			System.out.println("digits of number are  distinct");
		}
		else
		{
			System.out.println("Not distinct!!");
		}
		
	}

}
