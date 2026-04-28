package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side1 of triangle:");
		int side1=sc.nextInt();
		System.out.println("Enter side2 of triangle:");
		int side2=sc.nextInt();
		System.out.println("Enter side3 of triangle:");
		int side3=sc.nextInt();
		
		if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
		{
			System.out.println("Valid Triangle!!");
		}
		else
		{
			System.out.println("Invalid Triangle!!");
		}
		sc.close();
	}

}
