package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		if(num1%2==0 && num2%2==0)
		{
			System.out.println("Both numbers are even");
		}
		else if((num1%2==0 && num2%2!=0) || (num1%2!=0 && num2%2==0))
		{
			System.out.println("One of number is even and other is  odd");
		}
		else
		{
			System.out.println("Both are odd");
		}
	}

}
