package Phase_1_Conditional_Thinking_ifElse_Boolean_Logic.Level_1_Simple_Conditions;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Character:");
	String ch =sc.next().toLowerCase();
	
	if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u"))
	{
		System.out.println("character is vowel!!");
	}
	else
	{
		System.out.println("character is consonant!!");
	}

	}
}
