package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number");
		int month=sc.nextInt();
		
		switch(month)
		{
		case 1:
		{
			System.out.println("January:31 days");
			break;
		}
		case 2:
		{
			System.out.println("Feb:28 days");
			break;
		}
		case 3:
		{
			System.out.println("March:31 days");
			break;
		}
		case 4:
		{
			System.out.println("April:30 days");
			break;
		}
		case 5:
		{
			System.out.println("May:31 days");
			break;
		}
		case 6:
		{
			System.out.println("June:30 days");
			break;
		}
		case 7:
		{
			System.out.println("July:31 days");
			break;
		}
		case 8:
		{
			System.out.println("Aug:31 days");
			break;
		}
		case 9:
		{
			System.out.println("Sep:30 days");
			break;
		}
		case 10:
		{
			System.out.println("Oct:31 days");
			break;
		}
		case 11:
		{
			System.out.println("Nov:30 days");
			break;
		}
		case 12:
		{
			System.out.println("Dec:31 days");
			break;
		}
		
		}

	}

}
